select * from vendedor;

select ps.numpieza from preciosum ps, vendedor v where ps.numvend=v.numvend and v.provincia=('VALENCIA', 'CASTELLON', 'ALICANTE');
