import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateemployeeaddressComponent } from './updateemployeeaddress.component';

describe('UpdateemployeeaddressComponent', () => {
  let component: UpdateemployeeaddressComponent;
  let fixture: ComponentFixture<UpdateemployeeaddressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateemployeeaddressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateemployeeaddressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
