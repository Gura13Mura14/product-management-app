// add-product.component.ts
import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product.model';
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  standalone: true,
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css'],
  imports: [FormsModule]
})
export class AddProductComponent implements OnInit {
  product: Product = { id: 0, name: '', image: '', description: '' };
  isEdit = false;

  constructor(
    private service: ProductService,
    private route: ActivatedRoute,
    private router: Router
  ) {}
ngOnInit(): void {
  const idParam = this.route.snapshot.paramMap.get('id');
const id = idParam ? +idParam : null;
console.log('ngOnInit - id:', id);
if (id) {
  const existing = this.service.getProductById(id);
  console.log('ngOnInit - existing product:', existing);
  if (existing) {
    this.product = { ...existing };
    this.isEdit = true;
    }
  }
}
save() {
  console.log('save() - isEdit:', this.isEdit, 'product:', this.product);
  if (this.isEdit) {
    this.service.updateProduct(this.product);
  } else {
    this.service.addProduct(this.product);
  }
  this.router.navigate(['/']);
}

}