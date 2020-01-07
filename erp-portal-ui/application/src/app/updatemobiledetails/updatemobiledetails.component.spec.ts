import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatemobiledetailsComponent } from './updatemobiledetails.component';

describe('UpdatemobiledetailsComponent', () => {
  let component: UpdatemobiledetailsComponent;
  let fixture: ComponentFixture<UpdatemobiledetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdatemobiledetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatemobiledetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
