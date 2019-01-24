import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from './../../../environments/environment';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BackService {

  private URI = environment.baseUrl;

  constructor(private httpClient: HttpClient) { }

  helloEvent(transactionId: String): Observable<any> {
    return this.httpClient.post<void>(`${this.URI}/hello`, transactionId);
  }
}

