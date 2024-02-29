import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { NgOptimizedImage } from '@angular/common'
import {MatIconModule} from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';
import {MatButtonModule} from '@angular/material/button';
import { ReactiveFormsModule } from '@angular/forms';
import { MatAutocompleteModule } from '@angular/material/autocomplete';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { FooterComponent } from './Components/footer/footer.component';
import { TopnavComponent } from './Components/topnav/topnav.component';
import { RegisterComponent } from './Components/register/register.component';
import { SigninComponent } from './Components/signin/signin.component';
import { SliderComponent } from './Components/slider/slider.component';
import { NewsComponent } from './Components/news/news.component';
import { AboutComponent } from './Components/about/about.component';
import { DonationComponent } from './pages/donation/donation.component';
import { RequestComponent } from './pages/request/request.component';
import { ConcernComponent } from './pages/concern/concern.component';
import { ProofComponent } from './pages/proof/proof.component';
import { TransparencyComponent } from './pages/transparency/transparency.component';
import { LegalComponent } from './Components/legal/legal.component';
import { GalleryComponent } from './Components/gallery/gallery.component';
import { AdminComponent } from './Components/admin/admin.component';
import { ReadnewsComponent } from './Components/readnews/readnews.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomepageComponent,
    FooterComponent,
    TopnavComponent,
    RegisterComponent,
    SigninComponent,
    SliderComponent,
    NewsComponent,
    AboutComponent,
    DonationComponent,
    RequestComponent,
    ConcernComponent,
    ProofComponent,
    TransparencyComponent,
    LegalComponent,
    GalleryComponent,
    AdminComponent,
    ReadnewsComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatFormFieldModule,
    MatSelectModule,
    MatSnackBarModule,
    NgOptimizedImage,
    MatIconModule,
    MatTableModule,
    MatButtonModule,
    ReactiveFormsModule,
    MatAutocompleteModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
