import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

  class Response {
  text: string;

  constructor() {
    this.text = "";
  }

}

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {

  helloWorld: string = "";
  constructor(private httpClient: HttpClient) {
  }

  ngOnInit(): void {
    this.getHelloWorld();
  }

  getHelloWorld(): void {
    this.httpClient.get<any>("http://localhost:8081/").subscribe(
      res => {
        let tmp: Response;
        tmp = res;
        this.helloWorld = tmp.text;

      }
    )
  }

}
