import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateEmployeecommunicationComponent } from './create-employeecommunication.component';

describe('CreateEmployeecommunicationComponent', () => {
  let component: CreateEmployeecommunicationComponent;
  let fixture: ComponentFixture<CreateEmployeecommunicationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateEmployeecommunicationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateEmployeecommunicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
