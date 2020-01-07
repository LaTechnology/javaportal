import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateemployeecommunicationComponent } from './updateemployeecommunication.component';

describe('UpdateemployeecommunicationComponent', () => {
  let component: UpdateemployeecommunicationComponent;
  let fixture: ComponentFixture<UpdateemployeecommunicationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateemployeecommunicationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateemployeecommunicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
