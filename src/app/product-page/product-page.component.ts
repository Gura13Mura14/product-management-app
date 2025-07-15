import { Component } from '@angular/core';
import { Product } from '../product.model';
import { CommonModule } from '@angular/common';
import { ProductListComponent } from '../product-list/product-list.component';
import { ProductDetailComponent } from '../product-detail/product-detail.component';

@Component({
  selector: 'app-product-page',
  standalone: true,
  imports: [CommonModule, ProductListComponent, ProductDetailComponent],
  templateUrl: './product-page.component.html',
  styleUrls: ['./product-page.component.css'],
})
export class ProductPageComponent {
  selectedProduct: Product | null = null;

  onProductSelected(product: Product) {
    this.selectedProduct = product;
  }
}
