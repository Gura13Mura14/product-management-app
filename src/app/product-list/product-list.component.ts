import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product.model';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common'; 
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-product-list',
  standalone: true,
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
  imports: [CommonModule, RouterModule]
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];

  @Output() selectedProduct = new EventEmitter<Product>(); // ✅ مخرج لتمرير المنتج المختار

  constructor(private productService: ProductService, private router: Router) {}

  ngOnInit() {
    this.productService.products$.subscribe(data => {
      this.products = data;
      console.log('تم استلام المنتجات:', data);
    });
  }

  selectProduct(product: Product) {
  this.router.navigate(['/product', product.id]);
}

  viewDetails(product: Product) {
  this.router.navigate(['/product', product.id]);
}

  delete(product: Product) {
    this.productService.deleteProduct(product.id);
  }

  edit(product: Product) {
    this.router.navigate(['/add'], { queryParams: { ...product } });
  }
}
