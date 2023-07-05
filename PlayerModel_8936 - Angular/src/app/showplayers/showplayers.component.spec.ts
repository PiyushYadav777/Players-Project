import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowplayersComponent } from './showplayers.component';

describe('ShowplayersComponent', () => {
  let component: ShowplayersComponent;
  let fixture: ComponentFixture<ShowplayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowplayersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowplayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
