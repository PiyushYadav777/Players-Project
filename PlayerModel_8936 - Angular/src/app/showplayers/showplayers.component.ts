import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-showplayers',
  templateUrl: './showplayers.component.html',
  styleUrls: ['./showplayers.component.css']
})
export class ShowplayersComponent implements OnInit{
  constructor(private ps:PlayerService){
    this.viewPlayers();
  }
  players:any;
  viewPlayers(){
    this.ps.showplayers().subscribe((resp:any)=>{this.players=resp});

  }
  ngOnInit(): void {
    
  }

}
