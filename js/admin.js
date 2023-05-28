document.addEventListener('DOMContentLoaded', function() {
    const buttons = document.querySelectorAll('[data-popup]');
    const wrapper = document.querySelector('.wrapper');
    const popups = document.querySelectorAll('.popup');
  
    buttons.forEach(function(button) {
      button.addEventListener('click', function() {
        const popupId = button.getAttribute('data-popup');
        const popup = document.getElementById(popupId);
        
        if (popup) {
          wrapper.classList.add('show-popup');
          popup.classList.add('active');
        }
      });
    });
  
    popups.forEach(function(popup) {
      const closeButton = popup.querySelector('.icon-close');
  
      closeButton.addEventListener('click', function() {
        wrapper.classList.remove('show-popup');
        popup.classList.remove('active');
      });
    });
  });