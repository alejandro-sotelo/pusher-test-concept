import { BackService } from './core/service/back.service';
import { Component, OnInit } from '@angular/core';
import { PusherService } from './core/service/pusher.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  title = 'pusher-client';
  response = '';
  idInput  = '';

  constructor(private pusherService:PusherService, private backService:BackService){
  }
  
  ngOnInit(){
  }

  triggerRequest(){
    this.backService.helloEvent(this.idInput).subscribe();
    this.pusherService.channel.bind(this.idInput, data => {
      this.response = data.message ;
    });
  }
}
