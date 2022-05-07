# Bài TH2 - Nhóm 5
1. Hoàng Anh Đức - B19DCCN192
2. Nguyễn Văn Hiếu - B19DCCN252
3. Nguyễn Kim Mạnh - B19DCCN420

# Phân công công việc
### Nguyễn Văn Hiếu: 
* Tạo view index.html
* Tạo getmapping đến index trong controller 
* Tạo getmapping đến view hiển thị danh sách product
* Tạo trang view hiển thị danh sách sản phẩm, tạo model Product và các phần liên quan trong ProductRepository và ProductServiceImplement

### Hoàng Anh Đức: 
* Mô tả luồng hoạt động của các chức năng
* Chức năng sửa sản phẩm Edit/Update Product (View, Controller, Repository, Service):Code của mỗi product sẽ đc truyền vào link của edit
url. Controller lấy code đó, đưa cho Service rồi tới Repository để tìm product trong db, lấy ra và hiển thịởView. Thực hiện chinh sửa và
bước lưu vào db tương tự create product

### Nguyễn Kim Mạnh: 
* Chức năng thêm sản phẩm Create Product (Tạo form trong view add.html, Mapping trong controller, Repository và Service): Khi nhấn vào
create, Controller thực hiện phương thức Get với link .. để show ra form với một product rỗng. Sau khi điền thông tin và nhấn submit,
Controller sẽ nhận đc product với đầy đủ thông tin. Controller đưa nó cho Service rồi tới Repository để lưu vào db
* Chức năng xóa sản phẩm Delete/Confirm Delete Product (View, Controller, Repository, Service):Cách Controller lấy được mã code tương
tự vs luồng của edit. Controller lấy được mã code, gọi tới Service và Repository để lấy product theo code từ trong db và hiển thị ra view.
Khi nhấn xác nhận delele, mã code lại được truyền về C, S,V để xoá product trong db theo code.

