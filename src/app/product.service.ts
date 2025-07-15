import { Injectable } from '@angular/core';
import { Product } from './product.model';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private products: Product[] = [
    { id: 1, name: 'Product 1', image: 'assets/Product1.jpg', description: 'Details of Product 1' },
  ];

  private productsSubject = new BehaviorSubject<Product[]>(this.products);
  products$ = this.productsSubject.asObservable();

  getProductById(id: number): Product | undefined {
    return this.products.find(p => p.id === id);
  }

  addProduct(product: Product) {
    product.id = Date.now(); // generate id
    this.products.push(product);
    this.productsSubject.next(this.products);
      console.log('تمت الإضافة:', this.products);
  }

 deleteProduct(id: number) {
  this.products = this.products.filter(p => p.id !== id);
  this.productsSubject.next(this.products); // مهم جدا!
}


updateProduct(product: Product) {
  const index = this.products.findIndex(p => p.id === product.id);
  if (index !== -1) {
    this.products[index] = product;
  }
}

}
