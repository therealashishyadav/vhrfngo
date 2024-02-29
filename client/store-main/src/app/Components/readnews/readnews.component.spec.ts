import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadnewsComponent } from './readnews.component';

describe('ReadnewsComponent', () => {
  let component: ReadnewsComponent;
  let fixture: ComponentFixture<ReadnewsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadnewsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReadnewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
