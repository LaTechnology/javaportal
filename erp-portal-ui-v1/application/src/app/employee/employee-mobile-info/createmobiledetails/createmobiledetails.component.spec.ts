import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatemobiledetailsComponent } from './createmobiledetails.component';

describe('CreatemobiledetailsComponent', () => {
  let component: CreatemobiledetailsComponent;
  let fixture: ComponentFixture<CreatemobiledetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreatemobiledetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatemobiledetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
