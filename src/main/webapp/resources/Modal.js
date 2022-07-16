$(document).ready(function(){



	$('#example').DataTable();



	$(document).on('click','.btnUpdate',function(){


		var id = $(this).closest('.categoryRow').find('.columnId').text();
		var name = $(this).closest('.categoryRow').find('.columnName').text();

		$('#categoryId').val(id);
		$('#categoryName').val(name);
		
		
		});
		

		$(document).on('click','.btnDelete',function(){


		var id = $(this).closest('.categoryRow').find('.columnId').text();
		var name = $(this).closest('.categoryRow').find('.columnName').text();

		$('#deleteCategoryId').val(id);
		$('#lblCategoryName').text(name);
		
	
		});
		
			
		$(document).on('click','#btnDeleteForm',function(){
		
		
		$.ajax({   
			
			
			url:'deleteCategory',
			
			type:'POST',
			
			data:{
				
				catId : $('#deleteCategoryId').val()
				
				
			},
			success:function(table){
				
				$('#modalforDelete').modal('hide');
				
				$('#example').html(table);

			},error: function(jqXHR,textStatus,errorThrown){
				
				alert(errorThrown);
				
				
			}
			
						
		});
		
			});
				
		
});


