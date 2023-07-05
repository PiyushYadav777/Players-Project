import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { InsertPlayerComponent } from './insert-player/insert-player.component';
import {HttpClientModule} from '@angular/common/http';
import { ShowplayersComponent } from './showplayers/showplayers.component'
@NgModule({
  declarations: [
    AppComponent,
    InsertPlayerComponent,
    ShowplayersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
