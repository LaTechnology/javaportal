import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobiledetailsinfolistComponent } from './mobiledetailsinfolist.component';

describe('MobiledetailsinfolistComponent', () => {
  let component: MobiledetailsinfolistComponent;
  let fixture: ComponentFixture<MobiledetailsinfolistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobiledetailsinfolistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobiledetailsinfolistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
