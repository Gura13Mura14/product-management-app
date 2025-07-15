import { Component } from '@angular/core';
import { Product } from './product.model';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { CommonModule } from '@angular/common';
import { RouterOutlet, RouterModule } from "@angular/router";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, ProductListComponent, ProductDetailComponent, RouterOutlet, RouterModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  selectedProduct?: Product;
   title = 'productApp';

  onProductSelected(product: Product): void {
    this.selectedProduct = product;
  }
}
