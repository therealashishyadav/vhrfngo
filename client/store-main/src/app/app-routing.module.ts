import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { FooterComponent } from './Components/footer/footer.component';
import { TopnavComponent } from './Components/topnav/topnav.component';
import { RegisterComponent } from './Components/register/register.component';
import { SigninComponent } from './Components/signin/signin.component';
import { SliderComponent } from './Components/slider/slider.component';
import { AboutComponent } from './Components/about/about.component';
import { DonationComponent } from './pages/donation/donation.component';
import { RequestComponent } from './pages/request/request.component';
import { ConcernComponent } from './pages/concern/concern.component';
import { ProofComponent } from './pages/proof/proof.component';
import { TransparencyComponent } from './pages/transparency/transparency.component';
import { LegalComponent } from './Components/legal/legal.component';
import { GalleryComponent } from './Components/gallery/gallery.component';
import { AdminComponent } from './Components/admin/admin.component';
import { NewsComponent } from './Components/news/news.component';
import { ReadnewsComponent } from './Components/readnews/readnews.component';



const routes: Routes = [
  { path: "navbar", component: NavbarComponent },
  { path: "homepage", component: HomepageComponent },
  { path: "footer", component: FooterComponent },
  { path: "topnav", component: TopnavComponent },
  { path: "register", component: RegisterComponent },
  { path: "signin", component: SigninComponent },
  { path: "slider", component: SliderComponent },
  { path: "about", component: AboutComponent },
  { path: "donation", component: DonationComponent },
  { path: "request", component: RequestComponent },
  { path: "concern", component: ConcernComponent },
  { path: "proof", component: ProofComponent },
  { path: "legal", component: LegalComponent },
  { path: "transparency", component: TransparencyComponent },
  { path: "gallery", component: GalleryComponent },
  { path: "admin", component: AdminComponent },
  { path: "news", component: NewsComponent },
  { path: "readnews", component: ReadnewsComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
