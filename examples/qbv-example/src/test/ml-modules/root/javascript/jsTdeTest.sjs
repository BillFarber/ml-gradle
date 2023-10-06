'use strict';
const op = require('/MarkLogic/optic');
op.fromView('HR', 'employees')
  .result();