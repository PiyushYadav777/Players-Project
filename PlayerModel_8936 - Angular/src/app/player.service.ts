import { Injectable } from '@angular/core';
import { InsertPlayerComponent } from './insert-player/insert-player.component';
import{ HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class PlayerService {
url1="http://localhost:9191/saveplayer";
url2="http://localhost:9191/players"
  constructor(private http:HttpClient) { }
  InsertPlayer(insert:any){
    return this.http.post(this.url1,insert)
  }
  
  showplayers(){
    return this.http.get(this.url2,)
  }
}
