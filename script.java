const toggle = document.getElementById('menu-toggle');
const navbar = document.getElementById('navbar');

toggle.addEventListener('click', () => {
  navbar.style.display = navbar.style.display === 'flex' ? 'none' : 'flex';
});

document.getElementById('contact-form').addEventListener('submit', function(e) {
  e.preventDefault();
  alert('Thanks for contacting us! We’ll get back to you shortly.');
  this.reset();
});
