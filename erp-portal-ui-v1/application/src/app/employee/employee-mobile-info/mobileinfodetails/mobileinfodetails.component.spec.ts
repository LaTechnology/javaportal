import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobileinfodetailsComponent } from './mobileinfodetails.component';

describe('MobileinfodetailsComponent', () => {
  let component: MobileinfodetailsComponent;
  let fixture: ComponentFixture<MobileinfodetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobileinfodetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobileinfodetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
