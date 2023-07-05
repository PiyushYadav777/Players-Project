import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-insert-player',
  templateUrl: './insert-player.component.html',
  styleUrls: ['./insert-player.component.css'],
  providers: [PlayerService]
})
export class InsertPlayerComponent implements OnInit {
constructor(private ps:PlayerService){}
  savePlayer(insert:any){
    this.ps.InsertPlayer(insert.value).subscribe();
  }
  ngOnInit():void{}
}

