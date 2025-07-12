import { Routes } from '@angular/router';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ProductPageComponent } from './product-page/product-page.component';

export const routes: Routes = [
  { path: '', component: ProductListComponent },
  { path: 'add', component: AddProductComponent },
  { path: 'edit/:id', component: AddProductComponent },
  { path: 'product/:id', component: ProductDetailComponent },
  { path: '**', redirectTo: '' },
];



