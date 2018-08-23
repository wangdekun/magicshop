import { ItourModule } from './itour.module';

describe('ItourModule', () => {
  let itourModule: ItourModule;

  beforeEach(() => {
    itourModule = new ItourModule();
  });

  it('should create an instance', () => {
    expect(itourModule).toBeTruthy();
  });
});
