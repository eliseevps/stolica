package stolica;

import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.table.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.BuyerModel;
import models.GoodsModel;
import models.SellerModel;
import models.CategoryModel;
import models.BuyGoodsModel;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.border.LineBorder;
import models.OrderModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Stolica extends javax.swing.JFrame {
    String StatusCheck;
    int Control;
    int i=0;
    String DateStart;
    String DateEnd;
    Order OrderObj = new Order();
    Category CategoryObj = new Category();
    Goods GoodsObj = new Goods();
    Seller SellerObj = new Seller();
    Buyer BuyerObj = new Buyer();
    BuyGoods BuyGoodsObj = new BuyGoods();
    Check CheckObj = new Check();
    int NameNameCategoryFieldCheck=0;
    int GoodsFieldCheck=0;
    int ManufacturerFieldCheck=0;
    int CostUnitFieldCheck=0;
    int CountFieldCheck=0;
    int SellerFieldCheck=0;
    int InnSellerFieldCheck=0;
    int CountryFieldFieldCheck=0;
    int ChiefFieldFieldCheck=0;
    int AddressFieldFieldCheck=0;
    int PhoneFieldFieldCheck=0;
    int ManagerFieldFieldCheck=0;
    int PhonePlusFieldCheck=0;
    int BankFieldCheck=0;
    int AccountFieldCheck=0;
    int ClientFieldCheck=0;
    int InnClientFieldCheck=0;
    int CountryClientFieldCheck=0;
    int DirectorFieldCheck=0;
    int AddressClientFieldCheck=0;
    int PhoneDirFieldCheck=0;
    int BankClientFieldCheck=0;
    int AccountClientFieldCheck=0;
    int VolumeFieldCheck=0;
    int CostUnitVolFieldCheck=0;
    int DateStartFieldCheck=0;
    int PeriodFieldCheck=0;
    int GoodsIDFieldCheck=0;
    int DateOtchetStartCheck=0;
    int DateOtchetEndCheck=0;
    private final MyDBConnection mdbc;
    private final java.sql.Statement stmt;
 
    public Stolica() throws  Exception{ 
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tables = new javax.swing.JTabbedPane();
        SellerPanel = new javax.swing.JPanel();
        SellerScroll = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        BuyerPanel = new javax.swing.JPanel();
        BuyerScroll = new javax.swing.JScrollPane();
        BuyerTable = new javax.swing.JTable();
        CategoryPanel = new javax.swing.JPanel();
        CategoryScroll = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        GoodsPanel = new javax.swing.JPanel();
        GoodsScroll = new javax.swing.JScrollPane();
        GoodsTable = new javax.swing.JTable();
        OrderPanel = new javax.swing.JPanel();
        OrderScroll = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        BuysPanel = new javax.swing.JPanel();
        BuysScroll = new javax.swing.JScrollPane();
        BuysTable = new javax.swing.JTable();
        CostPanel = new javax.swing.JPanel();
        OtchetLabel = new javax.swing.JLabel();
        DateOtchetStart = new javax.swing.JFormattedTextField();
        DateOtchetEnd = new javax.swing.JFormattedTextField();
        FormOtchet = new javax.swing.JButton();
        CancelOtchet = new javax.swing.JButton();
        OutlayLabel = new javax.swing.JLabel();
        OutlayResultLabel = new javax.swing.JLabel();
        SumLabel = new javax.swing.JLabel();
        SubResulLabel = new javax.swing.JLabel();
        ProfitLabel = new javax.swing.JLabel();
        ProfitResultLabel = new javax.swing.JLabel();
        ButtonsGoods = new javax.swing.JPanel();
        GoodsLabel = new javax.swing.JLabel();
        ManufacturerLabel = new javax.swing.JLabel();
        UnitLabel = new javax.swing.JLabel();
        CostUnitLabel = new javax.swing.JLabel();
        CountLabel = new javax.swing.JLabel();
        ComboSellerLabel = new javax.swing.JLabel();
        ComboCategoryLabel = new javax.swing.JLabel();
        GoodsField = new javax.swing.JTextField();
        ManufacturerField = new javax.swing.JTextField();
        CostUnitField = new javax.swing.JTextField();
        CountField = new javax.swing.JTextField();
        AddGoods = new javax.swing.JButton();
        CancelGoods = new javax.swing.JButton();
        ComboSeller = new javax.swing.JComboBox();
        ComboCategory = new javax.swing.JComboBox();
        UnitField = new javax.swing.JComboBox<>();
        ButtonsSeller = new javax.swing.JPanel();
        BankLabel = new javax.swing.JLabel();
        SellerLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        SellerField = new javax.swing.JTextField();
        AddressField = new javax.swing.JTextField();
        BankField = new javax.swing.JTextField();
        InnSellerLabel = new javax.swing.JLabel();
        InnSellerField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        AccountLabel = new javax.swing.JLabel();
        AccountField = new javax.swing.JTextField();
        CancelField = new javax.swing.JButton();
        CountryLabel = new javax.swing.JLabel();
        ManagerLabel = new javax.swing.JLabel();
        CountryField = new javax.swing.JTextField();
        ManagerField = new javax.swing.JTextField();
        ChiefLabel = new javax.swing.JLabel();
        PhonePlusLabel = new javax.swing.JLabel();
        ChiefField = new javax.swing.JTextField();
        PhonePlusField = new javax.swing.JTextField();
        AddSeller = new javax.swing.JButton();
        ButtonsBuyer = new javax.swing.JPanel();
        ClientLabel = new javax.swing.JLabel();
        AddressClientLabel = new javax.swing.JLabel();
        AddressClientField = new javax.swing.JTextField();
        ClientField = new javax.swing.JTextField();
        InnClientLabel = new javax.swing.JLabel();
        PhoneDirLabel = new javax.swing.JLabel();
        PhoneDirField = new javax.swing.JTextField();
        InnClientField = new javax.swing.JTextField();
        BankClientLabel = new javax.swing.JLabel();
        CountryClientLabel = new javax.swing.JLabel();
        CountryClientField = new javax.swing.JTextField();
        BankClientField = new javax.swing.JTextField();
        DirectorLabel = new javax.swing.JLabel();
        AccountClientLabel = new javax.swing.JLabel();
        DirectorField = new javax.swing.JTextField();
        AccountClientField = new javax.swing.JTextField();
        AddClient = new javax.swing.JButton();
        CancelClient = new javax.swing.JButton();
        ButtonsCategory = new javax.swing.JPanel();
        NameCategoryLabel = new javax.swing.JLabel();
        NameCategoryField = new javax.swing.JTextField();
        AddCategory = new javax.swing.JButton();
        CancelCategory = new javax.swing.JButton();
        ButtonsBuys = new javax.swing.JPanel();
        VolumeField = new javax.swing.JTextField();
        VolumeLabel = new javax.swing.JLabel();
        ComboBuyerLabel = new javax.swing.JLabel();
        CostUnitVolLabel = new javax.swing.JLabel();
        CostUnitVolField = new javax.swing.JTextField();
        AddBuys = new javax.swing.JButton();
        CancelBuys = new javax.swing.JButton();
        ComboGoodsLabel = new javax.swing.JLabel();
        ComboGoods = new javax.swing.JComboBox();
        ComboBuyer = new javax.swing.JComboBox();
        CostGoods = new javax.swing.JLabel();
        ButtonsOrder = new javax.swing.JPanel();
        DateStartField = new javax.swing.JFormattedTextField();
        GoodsIDField = new javax.swing.JTextField();
        PeriodLabel = new javax.swing.JLabel();
        CancelOrder = new javax.swing.JButton();
        AddOrder = new javax.swing.JButton();
        DateStartLabel = new javax.swing.JLabel();
        GoodsIDLabel = new javax.swing.JLabel();
        ComboGoodsIdLabel = new javax.swing.JLabel();
        CountOrderLabel = new javax.swing.JLabel();
        GoodsOrderLabel = new javax.swing.JLabel();
        GoodsOrderField = new javax.swing.JTextField();
        PeriodField = new javax.swing.JTextField();
        CountOrderField = new javax.swing.JTextField();
        CategoryLabel = new javax.swing.JLabel();
        CategoryOrderField = new javax.swing.JTextField();
        ComboGoodsID = new javax.swing.JComboBox<>();
        Buttons = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        StatusBar = new javax.swing.JLabel();
        MenuAED = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        MenuAdd = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenuItem();
        MenuDelete = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Торгово-посредническая фирма \"Столица\"");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Tables.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablesMouseClicked(evt);
            }
        });

        ResultSet rs=getResult(1);
        TableModel SellerModel=new SellerModel(rs);
        SellerTable.setModel(SellerModel);
        mdbc.close(rs);
        SellerScroll.setViewportView(SellerTable);
        RowSorter<TableModel> sorter =new TableRowSorter<TableModel>(SellerModel);
        SellerTable.setRowSorter(sorter);

        javax.swing.GroupLayout SellerPanelLayout = new javax.swing.GroupLayout(SellerPanel);
        SellerPanel.setLayout(SellerPanelLayout);
        SellerPanelLayout.setHorizontalGroup(
            SellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        SellerPanelLayout.setVerticalGroup(
            SellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellerPanelLayout.createSequentialGroup()
                .addComponent(SellerScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tables.addTab("Фирма продавец", SellerPanel);

        rs=getResult(2);
        TableModel BuyerModel=new BuyerModel(rs);
        BuyerTable.setModel(BuyerModel);
        mdbc.close(rs);
        BuyerScroll.setViewportView(BuyerTable);
        sorter =new TableRowSorter<TableModel>(BuyerModel);
        BuyerTable.setRowSorter(sorter);

        javax.swing.GroupLayout BuyerPanelLayout = new javax.swing.GroupLayout(BuyerPanel);
        BuyerPanel.setLayout(BuyerPanelLayout);
        BuyerPanelLayout.setHorizontalGroup(
            BuyerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuyerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        BuyerPanelLayout.setVerticalGroup(
            BuyerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuyerPanelLayout.createSequentialGroup()
                .addComponent(BuyerScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tables.addTab("Фирма покупатель", BuyerPanel);

        rs=getResult(3);
        TableModel CategoryModel=new CategoryModel(rs);
        CategoryTable.setModel(CategoryModel);
        mdbc.close(rs);
        CategoryScroll.setViewportView(CategoryTable);
        sorter =new TableRowSorter<TableModel>(CategoryModel);
        CategoryTable.setRowSorter(sorter);

        javax.swing.GroupLayout CategoryPanelLayout = new javax.swing.GroupLayout(CategoryPanel);
        CategoryPanel.setLayout(CategoryPanelLayout);
        CategoryPanelLayout.setHorizontalGroup(
            CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CategoryScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        CategoryPanelLayout.setVerticalGroup(
            CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoryPanelLayout.createSequentialGroup()
                .addComponent(CategoryScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tables.addTab("Категории товаров", CategoryPanel);

        rs=getResult(4);
        TableModel GoodsModel=new GoodsModel(rs);
        GoodsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GoodsTable.setModel(GoodsModel);
        mdbc.close(rs);
        GoodsScroll.setViewportView(GoodsTable);
        sorter =new TableRowSorter<TableModel>(GoodsModel);
        GoodsTable.setRowSorter(sorter);

        javax.swing.GroupLayout GoodsPanelLayout = new javax.swing.GroupLayout(GoodsPanel);
        GoodsPanel.setLayout(GoodsPanelLayout);
        GoodsPanelLayout.setHorizontalGroup(
            GoodsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GoodsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        GoodsPanelLayout.setVerticalGroup(
            GoodsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GoodsPanelLayout.createSequentialGroup()
                .addComponent(GoodsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tables.addTab("Заказы", GoodsPanel);

        rs=getResult(5);
        TableModel OrderModel=new OrderModel(rs);
        OrderTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OrderTable.setModel(OrderModel);
        mdbc.close(rs);
        OrderScroll.setViewportView(OrderTable);
        sorter =new TableRowSorter<TableModel>(OrderModel);
        OrderTable.setRowSorter(sorter);

        javax.swing.GroupLayout OrderPanelLayout = new javax.swing.GroupLayout(OrderPanel);
        OrderPanel.setLayout(OrderPanelLayout);
        OrderPanelLayout.setHorizontalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrderScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        OrderPanelLayout.setVerticalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanelLayout.createSequentialGroup()
                .addComponent(OrderScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tables.addTab("Поступления", OrderPanel);

        rs=getResult(6);
        TableModel BuyGoodsModel=new BuyGoodsModel(rs);
        BuysTable.setModel(BuyGoodsModel);
        mdbc.close(rs);
        BuysScroll.setViewportView(BuysTable);
        sorter =new TableRowSorter<TableModel>(BuyGoodsModel);
        BuysTable.setRowSorter(sorter);

        javax.swing.GroupLayout BuysPanelLayout = new javax.swing.GroupLayout(BuysPanel);
        BuysPanel.setLayout(BuysPanelLayout);
        BuysPanelLayout.setHorizontalGroup(
            BuysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuysScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        BuysPanelLayout.setVerticalGroup(
            BuysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuysPanelLayout.createSequentialGroup()
                .addComponent(BuysScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tables.addTab("Продажи", BuysPanel);

        CostPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                CostPanelComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CostPanelComponentShown(evt);
            }
        });

        OtchetLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OtchetLabel.setText("Для формирования отчета введите период");

        try {
            DateOtchetStart.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DateOtchetStart.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                DateOtchetStartCaretUpdate(evt);
            }
        });

        try {
            DateOtchetEnd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DateOtchetEnd.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                DateOtchetEndCaretUpdate(evt);
            }
        });

        FormOtchet.setBackground(new java.awt.Color(102, 153, 255));
        FormOtchet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FormOtchet.setText("Сформировать отчет");
        FormOtchet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormOtchetActionPerformed(evt);
            }
        });

        CancelOtchet.setBackground(new java.awt.Color(102, 153, 255));
        CancelOtchet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelOtchet.setText("Отменить формирование");
        CancelOtchet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOtchetActionPerformed(evt);
            }
        });

        OutlayLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OutlayLabel.setText("Затраты на товары:");

        SumLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SumLabel.setText("Сумма продаж товаров:");

        ProfitLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ProfitLabel.setText("Прибыль фирмы:");

        javax.swing.GroupLayout CostPanelLayout = new javax.swing.GroupLayout(CostPanel);
        CostPanel.setLayout(CostPanelLayout);
        CostPanelLayout.setHorizontalGroup(
            CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CostPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CancelOtchet)
                    .addGroup(CostPanelLayout.createSequentialGroup()
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CostPanelLayout.createSequentialGroup()
                                .addComponent(DateOtchetStart, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(DateOtchetEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(OtchetLabel)
                            .addComponent(FormOtchet, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OutlayLabel)
                            .addComponent(SumLabel)
                            .addComponent(ProfitLabel))
                        .addGap(55, 55, 55)
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubResulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OutlayResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfitResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(653, Short.MAX_VALUE))
        );
        CostPanelLayout.setVerticalGroup(
            CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CostPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CostPanelLayout.createSequentialGroup()
                        .addComponent(OtchetLabel)
                        .addGap(18, 18, 18)
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateOtchetEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOtchetStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(FormOtchet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ProfitLabel)
                        .addGroup(CostPanelLayout.createSequentialGroup()
                            .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CostPanelLayout.createSequentialGroup()
                                    .addComponent(OutlayLabel)
                                    .addGap(32, 32, 32)
                                    .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SubResulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SumLabel)))
                                .addComponent(OutlayResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addComponent(ProfitResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(CancelOtchet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        Tables.addTab("Прибыль фирмы", CostPanel);

        GoodsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GoodsLabel.setText("Наименование");

        ManufacturerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManufacturerLabel.setText("Изготовитель");

        UnitLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UnitLabel.setText("Единица измерения");

        CostUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CostUnitLabel.setText("Цена за единицу");

        CountLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CountLabel.setText("Количество");

        ComboSellerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ComboSellerLabel.setText("Продавец");

        ComboCategoryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ComboCategoryLabel.setText("Категория");

        GoodsField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                GoodsFieldCaretUpdate(evt);
            }
        });
        GoodsField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GoodsFieldFocusGained(evt);
            }
        });

        ManufacturerField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                ManufacturerFieldCaretUpdate(evt);
            }
        });
        ManufacturerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ManufacturerFieldFocusGained(evt);
            }
        });

        CostUnitField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CostUnitFieldCaretUpdate(evt);
            }
        });
        CostUnitField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CostUnitFieldFocusGained(evt);
            }
        });

        CountField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CountFieldCaretUpdate(evt);
            }
        });
        CountField.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CountFieldMouseMoved(evt);
            }
        });
        CountField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CountFieldFocusGained(evt);
            }
        });
        CountField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CountFieldMouseExited(evt);
            }
        });

        AddGoods.setBackground(new java.awt.Color(102, 153, 255));
        AddGoods.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddGoods.setText("Сохранить");
        AddGoods.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddGoodsMouseMoved(evt);
            }
        });
        AddGoods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddGoodsMouseExited(evt);
            }
        });
        AddGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGoodsActionPerformed(evt);
            }
        });

        CancelGoods.setBackground(new java.awt.Color(102, 153, 255));
        CancelGoods.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelGoods.setText("Отменить");
        CancelGoods.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CancelGoodsMouseMoved(evt);
            }
        });
        CancelGoods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelGoodsMouseExited(evt);
            }
        });
        CancelGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelGoodsActionPerformed(evt);
            }
        });

        ComboSeller.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ComboSellerFocusGained(evt);
            }
        });

        ComboCategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ComboCategoryFocusGained(evt);
            }
        });

        UnitField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "КГ", "ШТУК" }));

        javax.swing.GroupLayout ButtonsGoodsLayout = new javax.swing.GroupLayout(ButtonsGoods);
        ButtonsGoods.setLayout(ButtonsGoodsLayout);
        ButtonsGoodsLayout.setHorizontalGroup(
            ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsGoodsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsGoodsLayout.createSequentialGroup()
                        .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GoodsLabel)
                            .addComponent(CountLabel))
                        .addGap(47, 47, 47)
                        .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GoodsField)
                            .addComponent(CountField))
                        .addGap(39, 39, 39)
                        .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManufacturerLabel)
                            .addComponent(ComboSellerLabel))
                        .addGap(52, 52, 52)
                        .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ManufacturerField)
                            .addComponent(ComboSeller, 0, 154, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboCategoryLabel)
                            .addComponent(UnitLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UnitField, 0, 95, Short.MAX_VALUE)
                            .addComponent(ComboCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99)
                        .addComponent(CostUnitLabel)
                        .addGap(52, 52, 52)
                        .addComponent(CostUnitField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(ButtonsGoodsLayout.createSequentialGroup()
                        .addComponent(AddGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(CancelGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ButtonsGoodsLayout.setVerticalGroup(
            ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsGoodsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoodsField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GoodsLabel)
                        .addComponent(ManufacturerLabel)
                        .addComponent(ManufacturerField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UnitLabel)
                        .addComponent(CostUnitLabel)
                        .addComponent(CostUnitField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UnitField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CountField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CountLabel)
                    .addComponent(ComboSellerLabel)
                    .addComponent(ComboSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboCategoryLabel)
                    .addComponent(ComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ButtonsGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddGoods)
                    .addComponent(CancelGoods))
                .addGap(31, 31, 31))
        );

        BankLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BankLabel.setText("Банк");

        SellerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SellerLabel.setText("Продавец");

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddressLabel.setText("Адрес");

        SellerField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                SellerFieldCaretUpdate(evt);
            }
        });
        SellerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SellerFieldFocusGained(evt);
            }
        });

        AddressField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AddressFieldCaretUpdate(evt);
            }
        });
        AddressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AddressFieldFocusGained(evt);
            }
        });

        BankField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                BankFieldCaretUpdate(evt);
            }
        });
        BankField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BankFieldFocusGained(evt);
            }
        });

        InnSellerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        InnSellerLabel.setText("ИНН");

        InnSellerField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                InnSellerFieldCaretUpdate(evt);
            }
        });
        InnSellerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InnSellerFieldFocusGained(evt);
            }
        });

        PhoneField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PhoneFieldCaretUpdate(evt);
            }
        });
        PhoneField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneFieldFocusGained(evt);
            }
        });

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PhoneLabel.setText("Телефон");

        AccountLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AccountLabel.setText("Номер счета");

        AccountField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AccountFieldCaretUpdate(evt);
            }
        });
        AccountField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountFieldFocusGained(evt);
            }
        });

        CancelField.setBackground(new java.awt.Color(102, 153, 255));
        CancelField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelField.setText("Отменить");
        CancelField.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CancelFieldMouseMoved(evt);
            }
        });
        CancelField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelFieldMouseExited(evt);
            }
        });
        CancelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelFieldActionPerformed(evt);
            }
        });

        CountryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CountryLabel.setText("Страна");

        ManagerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManagerLabel.setText("Менеджер");

        CountryField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CountryFieldCaretUpdate(evt);
            }
        });
        CountryField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CountryFieldFocusGained(evt);
            }
        });

        ManagerField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                ManagerFieldCaretUpdate(evt);
            }
        });
        ManagerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ManagerFieldFocusGained(evt);
            }
        });

        ChiefLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChiefLabel.setText("Директор");

        PhonePlusLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PhonePlusLabel.setText("Телефон отдела продаж");

        ChiefField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                ChiefFieldCaretUpdate(evt);
            }
        });
        ChiefField.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ChiefFieldMouseMoved(evt);
            }
        });
        ChiefField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ChiefFieldFocusGained(evt);
            }
        });
        ChiefField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChiefFieldMouseExited(evt);
            }
        });

        PhonePlusField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PhonePlusFieldCaretUpdate(evt);
            }
        });
        PhonePlusField.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PhonePlusFieldMouseMoved(evt);
            }
        });
        PhonePlusField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhonePlusFieldFocusGained(evt);
            }
        });
        PhonePlusField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PhonePlusFieldMouseExited(evt);
            }
        });

        AddSeller.setBackground(new java.awt.Color(102, 153, 255));
        AddSeller.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddSeller.setText("Сохранить");
        AddSeller.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddSellerMouseMoved(evt);
            }
        });
        AddSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddSellerMouseExited(evt);
            }
        });
        AddSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSellerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsSellerLayout = new javax.swing.GroupLayout(ButtonsSeller);
        ButtonsSeller.setLayout(ButtonsSellerLayout);
        ButtonsSellerLayout.setHorizontalGroup(
            ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsSellerLayout.createSequentialGroup()
                .addGap(608, 608, 608)
                .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ButtonsSellerLayout.createSequentialGroup()
                        .addComponent(CountryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CountryField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonsSellerLayout.createSequentialGroup()
                        .addComponent(ManagerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ManagerField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChiefLabel)
                    .addComponent(PhonePlusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChiefField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(PhonePlusField))
                .addGap(46, 46, 46))
            .addGroup(ButtonsSellerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsSellerLayout.createSequentialGroup()
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SellerLabel)
                            .addComponent(AddressLabel)
                            .addComponent(BankLabel))
                        .addGap(43, 43, 43)
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AddressField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(SellerField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BankField))
                        .addGap(39, 39, 39)
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneLabel)
                            .addComponent(InnSellerLabel)
                            .addComponent(AccountLabel))
                        .addGap(34, 34, 34)
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccountField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InnSellerField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ButtonsSellerLayout.createSequentialGroup()
                        .addComponent(AddSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(CancelField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsSellerLayout.setVerticalGroup(
            ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsSellerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsSellerLayout.createSequentialGroup()
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SellerLabel)
                            .addComponent(SellerField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InnSellerLabel))
                        .addGap(18, 18, 18)
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressLabel)
                            .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneLabel))
                        .addGap(18, 18, 18)
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BankField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BankLabel)
                            .addComponent(AccountField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountLabel)))
                    .addGroup(ButtonsSellerLayout.createSequentialGroup()
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CountryField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CountryLabel)
                            .addComponent(InnSellerField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChiefLabel)
                            .addComponent(ChiefField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ManagerLabel)
                                .addComponent(ManagerField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhonePlusLabel)
                                .addComponent(PhonePlusField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(ButtonsSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CancelField)
                    .addComponent(AddSeller)))
        );

        ClientLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClientLabel.setText("Покупатель");

        AddressClientLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddressClientLabel.setText("Адрес");

        AddressClientField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AddressClientFieldCaretUpdate(evt);
            }
        });
        AddressClientField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AddressClientFieldFocusGained(evt);
            }
        });

        ClientField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                ClientFieldCaretUpdate(evt);
            }
        });
        ClientField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ClientFieldFocusGained(evt);
            }
        });

        InnClientLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        InnClientLabel.setText("ИНН");

        PhoneDirLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PhoneDirLabel.setText("Телефон");

        PhoneDirField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PhoneDirFieldCaretUpdate(evt);
            }
        });
        PhoneDirField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneDirFieldFocusGained(evt);
            }
        });

        InnClientField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                InnClientFieldCaretUpdate(evt);
            }
        });
        InnClientField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InnClientFieldFocusGained(evt);
            }
        });

        BankClientLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BankClientLabel.setText("Банк");

        CountryClientLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CountryClientLabel.setText("Страна");

        CountryClientField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CountryClientFieldCaretUpdate(evt);
            }
        });
        CountryClientField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CountryClientFieldFocusGained(evt);
            }
        });

        BankClientField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                BankClientFieldCaretUpdate(evt);
            }
        });
        BankClientField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BankClientFieldFocusGained(evt);
            }
        });

        DirectorLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DirectorLabel.setText("Директор");

        AccountClientLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AccountClientLabel.setText("Номер счета");

        DirectorField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                DirectorFieldCaretUpdate(evt);
            }
        });
        DirectorField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DirectorFieldFocusGained(evt);
            }
        });

        AccountClientField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AccountClientFieldCaretUpdate(evt);
            }
        });
        AccountClientField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountClientFieldFocusGained(evt);
            }
        });

        AddClient.setBackground(new java.awt.Color(102, 153, 255));
        AddClient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddClient.setText("Сохранить");
        AddClient.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddClientMouseMoved(evt);
            }
        });
        AddClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddClientMouseExited(evt);
            }
        });
        AddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientActionPerformed(evt);
            }
        });

        CancelClient.setBackground(new java.awt.Color(102, 153, 255));
        CancelClient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelClient.setText("Отменить");
        CancelClient.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CancelClientMouseMoved(evt);
            }
        });
        CancelClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelClientMouseExited(evt);
            }
        });
        CancelClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsBuyerLayout = new javax.swing.GroupLayout(ButtonsBuyer);
        ButtonsBuyer.setLayout(ButtonsBuyerLayout);
        ButtonsBuyerLayout.setHorizontalGroup(
            ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsBuyerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsBuyerLayout.createSequentialGroup()
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClientLabel)
                            .addComponent(AddressClientLabel))
                        .addGap(43, 43, 43)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClientField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(AddressClientField))
                        .addGap(54, 54, 54)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InnClientLabel)
                            .addComponent(PhoneDirLabel))
                        .addGap(61, 61, 61)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneDirField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InnClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CountryClientLabel)
                            .addComponent(BankClientLabel))
                        .addGap(31, 31, 31)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BankClientField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(CountryClientField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DirectorLabel)
                            .addComponent(AccountClientLabel))
                        .addGap(96, 96, 96)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AccountClientField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(DirectorField))
                        .addGap(36, 36, 36))
                    .addGroup(ButtonsBuyerLayout.createSequentialGroup()
                        .addComponent(AddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(CancelClient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ButtonsBuyerLayout.setVerticalGroup(
            ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsBuyerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ButtonsBuyerLayout.createSequentialGroup()
                            .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ClientLabel)
                                .addComponent(ClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InnClientLabel))
                            .addGap(18, 18, 18)
                            .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddressClientLabel)
                                .addComponent(AddressClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhoneDirLabel)))
                        .addGroup(ButtonsBuyerLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(InnClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ButtonsBuyerLayout.createSequentialGroup()
                            .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DirectorLabel)
                                .addComponent(DirectorField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AccountClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AccountClientLabel))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsBuyerLayout.createSequentialGroup()
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CountryClientLabel)
                            .addComponent(CountryClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BankClientLabel)
                            .addComponent(BankClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneDirField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(ButtonsBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddClient)
                    .addComponent(CancelClient))
                .addGap(32, 32, 32))
        );

        NameCategoryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameCategoryLabel.setText("Наименование категории");

        NameCategoryField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NameCategoryFieldCaretUpdate(evt);
            }
        });
        NameCategoryField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameCategoryFieldFocusGained(evt);
            }
        });

        AddCategory.setBackground(new java.awt.Color(102, 153, 255));
        AddCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddCategory.setText("Сохранить");
        AddCategory.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddCategoryMouseMoved(evt);
            }
        });
        AddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddCategoryMouseExited(evt);
            }
        });
        AddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCategoryActionPerformed(evt);
            }
        });

        CancelCategory.setBackground(new java.awt.Color(102, 153, 255));
        CancelCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelCategory.setText("Отменить");
        CancelCategory.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CancelCategoryMouseMoved(evt);
            }
        });
        CancelCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelCategoryMouseExited(evt);
            }
        });
        CancelCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsCategoryLayout = new javax.swing.GroupLayout(ButtonsCategory);
        ButtonsCategory.setLayout(ButtonsCategoryLayout);
        ButtonsCategoryLayout.setHorizontalGroup(
            ButtonsCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsCategoryLayout.createSequentialGroup()
                        .addComponent(NameCategoryLabel)
                        .addGap(100, 100, 100)
                        .addComponent(NameCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonsCategoryLayout.createSequentialGroup()
                        .addComponent(AddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(CancelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsCategoryLayout.setVerticalGroup(
            ButtonsCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameCategoryLabel)
                    .addComponent(NameCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCategory)
                    .addComponent(CancelCategory))
                .addGap(12, 12, 12))
        );

        VolumeField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                VolumeFieldCaretUpdate(evt);
            }
        });
        VolumeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                VolumeFieldFocusGained(evt);
            }
        });

        VolumeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VolumeLabel.setText("Количество");

        ComboBuyerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ComboBuyerLabel.setText("Покупатель");

        CostUnitVolLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CostUnitVolLabel.setText("Цена за единицу");

        CostUnitVolField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CostUnitVolFieldCaretUpdate(evt);
            }
        });
        CostUnitVolField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CostUnitVolFieldFocusGained(evt);
            }
        });

        AddBuys.setBackground(new java.awt.Color(102, 153, 255));
        AddBuys.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddBuys.setText("Сохранить");
        AddBuys.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddBuysMouseMoved(evt);
            }
        });
        AddBuys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddBuysMouseExited(evt);
            }
        });
        AddBuys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBuysActionPerformed(evt);
            }
        });

        CancelBuys.setBackground(new java.awt.Color(102, 153, 255));
        CancelBuys.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelBuys.setText("Отменить");
        CancelBuys.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CancelBuysMouseMoved(evt);
            }
        });
        CancelBuys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelBuysMouseExited(evt);
            }
        });
        CancelBuys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBuysActionPerformed(evt);
            }
        });

        ComboGoodsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ComboGoodsLabel.setText("Товар");

        ComboGoods.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboGoodsItemStateChanged(evt);
            }
        });

        ComboBuyer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ComboBuyerFocusGained(evt);
            }
        });

        javax.swing.GroupLayout ButtonsBuysLayout = new javax.swing.GroupLayout(ButtonsBuys);
        ButtonsBuys.setLayout(ButtonsBuysLayout);
        ButtonsBuysLayout.setHorizontalGroup(
            ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsBuysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsBuysLayout.createSequentialGroup()
                        .addComponent(VolumeLabel)
                        .addGap(74, 74, 74)
                        .addComponent(VolumeField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(CostUnitVolLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ButtonsBuysLayout.createSequentialGroup()
                        .addComponent(AddBuys, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(CancelBuys, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ButtonsBuysLayout.createSequentialGroup()
                        .addComponent(CostUnitVolField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(ComboGoodsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(ComboBuyerLabel)
                        .addGap(101, 101, 101)
                        .addComponent(ComboBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(ButtonsBuysLayout.createSequentialGroup()
                        .addComponent(CostGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        ButtonsBuysLayout.setVerticalGroup(
            ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsBuysLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsBuysLayout.createSequentialGroup()
                        .addGroup(ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CostUnitVolLabel)
                            .addComponent(CostUnitVolField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboGoodsLabel)
                            .addComponent(ComboGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBuyerLabel)
                            .addComponent(ComboBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CostGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBuys)))
                    .addGroup(ButtonsBuysLayout.createSequentialGroup()
                        .addGroup(ButtonsBuysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VolumeLabel)
                            .addComponent(VolumeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelBuys)))
                .addGap(97, 97, 97))
        );

        try {
            DateStartField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DateStartField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                DateStartFieldCaretUpdate(evt);
            }
        });

        GoodsIDField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                GoodsIDFieldCaretUpdate(evt);
            }
        });

        PeriodLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PeriodLabel.setText("Срок хранения");

        CancelOrder.setBackground(new java.awt.Color(102, 153, 255));
        CancelOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelOrder.setText("Отменить");
        CancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderActionPerformed(evt);
            }
        });

        AddOrder.setBackground(new java.awt.Color(102, 153, 255));
        AddOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddOrder.setText("Сохранить");
        AddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrderActionPerformed(evt);
            }
        });

        DateStartLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateStartLabel.setText("Дата производства");

        GoodsIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GoodsIDLabel.setText("Штрих-код товара");

        ComboGoodsIdLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ComboGoodsIdLabel.setText("Заказ");

        CountOrderLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CountOrderLabel.setText("Количество");

        GoodsOrderLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GoodsOrderLabel.setText("Товар");

        GoodsOrderField.setEnabled(false);

        PeriodField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PeriodFieldCaretUpdate(evt);
            }
        });

        CountOrderField.setEnabled(false);

        CategoryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CategoryLabel.setText("Категория");

        CategoryOrderField.setEnabled(false);

        ComboGoodsID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboGoodsIDItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout ButtonsOrderLayout = new javax.swing.GroupLayout(ButtonsOrder);
        ButtonsOrder.setLayout(ButtonsOrderLayout);
        ButtonsOrderLayout.setHorizontalGroup(
            ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsOrderLayout.createSequentialGroup()
                        .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboGoodsIdLabel)
                            .addComponent(GoodsIDLabel))
                        .addGap(42, 42, 42)
                        .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboGoodsID, 0, 124, Short.MAX_VALUE)
                            .addComponent(GoodsIDField))
                        .addGap(65, 65, 65)
                        .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CountOrderLabel)
                            .addComponent(DateStartLabel))
                        .addGap(80, 80, 80)
                        .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateStartField, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(CountOrderField)))
                    .addGroup(ButtonsOrderLayout.createSequentialGroup()
                        .addComponent(AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(CancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoryLabel)
                    .addComponent(PeriodLabel))
                .addGap(72, 72, 72)
                .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoryOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeriodField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(GoodsOrderLabel)
                .addGap(67, 67, 67)
                .addComponent(GoodsOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        ButtonsOrderLayout.setVerticalGroup(
            ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboGoodsIdLabel)
                    .addComponent(DateStartLabel)
                    .addComponent(ComboGoodsID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateStartField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeriodLabel)
                    .addComponent(PeriodField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoodsOrderLabel)
                    .addComponent(GoodsOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoodsIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoodsIDLabel)
                    .addComponent(CountOrderLabel)
                    .addComponent(CountOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryLabel)
                    .addComponent(CategoryOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ButtonsOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddOrder)
                    .addComponent(CancelOrder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Buttons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 2));

        Add.setBackground(new java.awt.Color(102, 153, 255));
        Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Add.setText("Добавить");
        Add.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddMouseMoved(evt);
            }
        });
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(102, 153, 255));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setText("Удалить");
        Delete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DeleteMouseMoved(evt);
            }
        });
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(102, 153, 255));
        Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Update.setText("Редактировать");
        Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        Update.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UpdateMouseMoved(evt);
            }
        });
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        SearchField.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SearchFieldMouseMoved(evt);
            }
        });
        SearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchFieldMouseExited(evt);
            }
        });

        Search.setBackground(new java.awt.Color(102, 153, 255));
        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setText("Поиск");
        Search.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SearchMouseMoved(evt);
            }
        });
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchMouseExited(evt);
            }
        });
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsLayout = new javax.swing.GroupLayout(Buttons);
        Buttons.setLayout(ButtonsLayout);
        ButtonsLayout.setHorizontalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsLayout.setVerticalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(StatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.setText("Функции");
        Menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MenuAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuAdd.setText("Добавить");
        MenuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddActionPerformed(evt);
            }
        });
        Menu.add(MenuAdd);

        MenuEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuEdit.setText("Редактировать");
        MenuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEditActionPerformed(evt);
            }
        });
        Menu.add(MenuEdit);

        MenuDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        MenuDelete.setText("Удалить");
        MenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeleteActionPerformed(evt);
            }
        });
        Menu.add(MenuDelete);

        MenuAED.add(Menu);

        MenuExit.setText("Выход");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuExitMouseClicked(evt);
            }
        });
        MenuAED.add(MenuExit);

        setJMenuBar(MenuAED);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonsOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonsBuys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonsCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonsBuyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonsSeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButtonsGoods, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tables)
                            .addComponent(Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tables, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsBuys, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 /*private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed

    }//GEN-LAST:event_sendButtonActionPerformed
*/
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int response = JOptionPane.showOptionDialog(null, "Вы точно хотите выйти из приложения?", "Подтверждение", JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(response == JOptionPane.YES_OPTION){
            System.exit(0);
            mdbc.close(stmt);
            mdbc.destroy();
        }
    }//GEN-LAST:event_formWindowClosing

    public void addToCbb(JComboBox jComboBox,  String query){
        try {
            ResultSet resultSet = stmt.executeQuery(query);
            while(resultSet.next()){
                jComboBox.addItem(resultSet.getString(1));
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void addToField(JTextField JTextField,  String query){
        try {
            ResultSet resultSet = stmt.executeQuery(query);
            while(resultSet.next()){
                JTextField.setText(resultSet.getString(1));
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        Control = 1;
        Add.setEnabled(false);
        Delete.setEnabled(false);
        Update.setEnabled(false);
        Menu.setEnabled(false);
        Tables.setEnabled(false);
        SearchField.setEnabled(false);
        Search.setEnabled(false);
        GoodsTable.setEnabled(false);
        SellerTable.setEnabled(false);
        BuyerTable.setEnabled(false);
        BuysTable.setEnabled(false);
        CategoryTable.setEnabled(false);
        OrderTable.setEnabled(false);
        Menu.setEnabled(false);
        ComboGoodsID.setEnabled(false);
        Update.setBorder(new LineBorder(Color.blue, 1, true));
        if(Tables.getSelectedComponent()==GoodsPanel) {ButtonsGoods.setVisible(true);this.setSize(1374,524);}
        if(Tables.getSelectedComponent()==SellerPanel) {ButtonsSeller.setVisible(true);this.setSize(1374,577);}
        if(Tables.getSelectedComponent()==BuyerPanel) {ButtonsBuyer.setVisible(true);this.setSize(1374,530);}
        if(Tables.getSelectedComponent()==CategoryPanel) {ButtonsCategory.setVisible(true);this.setSize(1374,469);}
        if(Tables.getSelectedComponent()==BuysPanel) {ButtonsBuys.setVisible(true);setSize(1374,476); }
        if(Tables.getSelectedComponent()==OrderPanel) {ButtonsOrder.setVisible(true);setSize(1374,529); }
        String queryOrder = "SELECT ID_Goods FROM kind_goods where Status = 'Поступил'";
        String querySeller = "SELECT Seller FROM seller_firm";
        String queryCategory = "SELECT NameCategory FROM category";
        String queryBuyer = "SELECT Client FROM buyer_firm";
        String queryGoods = "SELECT Goods FROM order_goods";
        if(Tables.getSelectedComponent()==GoodsPanel) {
            int idRowTable;
            idRowTable = GoodsTable.getSelectedRow();
            GoodsField.setText((String)GoodsTable.getValueAt(idRowTable, 1));
            ManufacturerField.setText((String)GoodsTable.getValueAt(idRowTable, 2));
            UnitField.setSelectedItem((String)GoodsTable.getValueAt(idRowTable, 3));
            CostUnitField.setText((String)GoodsTable.getValueAt(idRowTable, 4));
            CountField.setText((String)GoodsTable.getValueAt(idRowTable, 5));  
            ComboSeller.removeAllItems();
            ComboCategory.removeAllItems();
            addToCbb(ComboSeller, querySeller);
            addToCbb(ComboCategory, queryCategory);
            StatusCheck=((String)GoodsTable.getValueAt(idRowTable, 8));
            ComboSeller.setSelectedItem((String)GoodsTable.getValueAt(idRowTable, 9));
            ComboCategory.setSelectedItem((String)GoodsTable.getValueAt(idRowTable, 10));
        }
        if(Tables.getSelectedComponent()==OrderPanel) {
            int idRowTable;
            idRowTable = OrderTable.getSelectedRow();
            GoodsOrderField.setText((String)OrderTable.getValueAt(idRowTable, 1));
            DateStartField.setText((String)OrderTable.getValueAt(idRowTable, 2));
            PeriodField.setText((String)OrderTable.getValueAt(idRowTable, 3));
            GoodsIDField.setText((String)OrderTable.getValueAt(idRowTable, 4));
            CountOrderField.setText((String)OrderTable.getValueAt(idRowTable, 5));
            CategoryOrderField.setText((String)OrderTable.getValueAt(idRowTable, 6));
            ComboGoodsID.removeAllItems();
            ComboCategory.removeAllItems();
            addToCbb(ComboGoodsID, queryOrder);
            ComboGoodsID.setSelectedItem((String)OrderTable.getValueAt(idRowTable, 7));

        }
        if(Tables.getSelectedComponent()==SellerPanel) {
            int idRowTable;
            idRowTable = SellerTable.getSelectedRow();
            SellerField.setText((String)SellerTable.getValueAt(idRowTable, 1));
            InnSellerField.setText((String)SellerTable.getValueAt(idRowTable, 2));
            CountryField.setText((String)SellerTable.getValueAt(idRowTable, 3));
            ChiefField.setText((String)SellerTable.getValueAt(idRowTable, 4));
            AddressField.setText((String)SellerTable.getValueAt(idRowTable, 5));
            PhoneField.setText((String)SellerTable.getValueAt(idRowTable, 6));
            ManagerField.setText((String)SellerTable.getValueAt(idRowTable, 7));
            PhonePlusField.setText((String)SellerTable.getValueAt(idRowTable, 8));  
            BankField.setText((String)SellerTable.getValueAt(idRowTable, 9));
            AccountField.setText((String)SellerTable.getValueAt(idRowTable, 10));
        }
        if(Tables.getSelectedComponent()==BuyerPanel) {
            int idRowTable;
            idRowTable = BuyerTable.getSelectedRow();
            ClientField.setText((String)BuyerTable.getValueAt(idRowTable, 1));
            InnClientField.setText((String)BuyerTable.getValueAt(idRowTable, 2));
            DirectorField.setText((String)BuyerTable.getValueAt(idRowTable, 3));
            PhoneDirField.setText((String)BuyerTable.getValueAt(idRowTable, 4));
            AddressClientField.setText((String)BuyerTable.getValueAt(idRowTable, 5));
            BankClientField.setText((String)BuyerTable.getValueAt(idRowTable, 6));
            AccountClientField.setText((String)BuyerTable.getValueAt(idRowTable, 7));
            CountryClientField.setText((String)BuyerTable.getValueAt(idRowTable, 8));  
        }
        if(Tables.getSelectedComponent()==CategoryPanel) {
            int idRowTable;
            idRowTable = CategoryTable.getSelectedRow();
            NameCategoryField.setText((String)CategoryTable.getValueAt(idRowTable, 1));
        }
        if(Tables.getSelectedComponent()==BuysPanel) {
            int idRowTable;
            idRowTable = BuysTable.getSelectedRow();
            VolumeField.setText((String)BuysTable.getValueAt(idRowTable, 1));
            CostUnitVolField.setText((String)BuysTable.getValueAt(idRowTable, 2));
            ComboGoods.removeAllItems();
            ComboBuyer.removeAllItems();
            addToCbb(ComboGoods, queryGoods);
            addToCbb(ComboBuyer, queryBuyer);
            ComboGoods.setSelectedItem((String)BuysTable.getValueAt(idRowTable, 5));
            ComboBuyer.setSelectedItem((String)BuysTable.getValueAt(idRowTable, 6));
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private double round(double number, int scale) {
        int pow = 10;
        for (int j = 1; j < scale; j++)
        pow *= 10;
        double tmp = number * pow;
        return (double) (int) ((tmp - (int) tmp) >= 0.5 ? tmp + 1 : tmp) / pow;
    }
    
    public  double SumGoods(){
        double count = 0.0;
        final String AddSumGoods = "SELECT SUM(AllCost) FROM kind_goods";
        try {    
            ResultSet rs = stmt.executeQuery(AddSumGoods);
            while(rs.next())
            {
                count = rs.getDouble(1);
            }
        }
        catch (SQLException e){
            System.err.println(""+e.getMessage());
        }
        return round(count, 2);
        
    }
      
        
    public String DateFormat(String oldDateString) throws ParseException{
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd.mm.yyyy", Locale.getDefault());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy.mm.dd", Locale.getDefault());
        Date date = oldDateFormat.parse(oldDateString);
        String result = newDateFormat.format(date);
        return result;
    }
    
    public String DateFormatOtchet(String oldDateString) throws ParseException{
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd.mm.yyyy", Locale.getDefault());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-mm-dd", Locale.getDefault());
        Date date = oldDateFormat.parse(oldDateString);
        String result = newDateFormat.format(date);
        return result;
    }
    
    public String DateToday(){
        String DateToday = null;
        final String AddDateToday = "SELECT DATE_FORMAT(CURDATE(),'%e.%m.%Y')";
        try {    
            ResultSet rs = stmt.executeQuery(AddDateToday);
            while(rs.next())
            {
                DateToday = rs.getString(1);
            }
        }
        catch (SQLException e){
            System.err.println(""+e.getMessage());
        }
        return DateToday;
    }
        
    public  double SumBuys(){
        double count = 0.0;
        final String AddSumBuys = "SELECT Sum(AllCostBuy) FROM buy_goods";
        try {    
            ResultSet rs = stmt.executeQuery(AddSumBuys);
            while(rs.next())
            {
                count = rs.getDouble(1);
            }
        }
        catch (SQLException e){
            System.err.println(""+e.getMessage());
        }
        return round(count, 2);
    }
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int yesNo;
        if(Tables.getSelectedComponent()==GoodsPanel) {
            int idRowTable = GoodsTable.getSelectedRow();
            yesNo = JOptionPane.showOptionDialog(null, "Вы точно хотите удалить этот товар?", "Подтверждение",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, null, null);
            if (idRowTable==0 && yesNo==0)
            {
                String ID_Goods =(String) GoodsTable.getValueAt(0, 0);
                GoodsObj.delGoods(ID_Goods);
                ResultSet rs=getResult(4);
                TableModel GoodsModel=new GoodsModel(rs);
                GoodsTable.setModel(GoodsModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(GoodsModel);
                GoodsTable.setRowSorter(sorter);
            }
            else if (yesNo==0)
            {
                String ID_Goods =(String) GoodsTable.getValueAt(idRowTable, 0);
                GoodsObj.delGoods(ID_Goods);
                ResultSet rs=getResult(4);
                TableModel GoodsModel=new GoodsModel(rs);
                GoodsTable.setModel(GoodsModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(GoodsModel);
                GoodsTable.setRowSorter(sorter);
            }
        }
        if(Tables.getSelectedComponent()==SellerPanel) {
            int idRowTable = SellerTable.getSelectedRow();
            yesNo = JOptionPane.showOptionDialog(null, "Вы точно хотите удалить этого продавца?", "Подтверждение",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, null, null);
            if (idRowTable==0 && yesNo==0){
                String ID_Seller =(String) SellerTable.getValueAt(0, 0);
                SellerObj.delSeller(ID_Seller);
                ResultSet rs=getResult(1);
                TableModel SellerModel=new SellerModel(rs);
                SellerTable.setModel(SellerModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(SellerModel);
                SellerTable.setRowSorter(sorter);
            }
            else if (yesNo==0){
                String ID_Seller =(String) SellerTable.getValueAt(idRowTable, 0);
                SellerObj.delSeller(ID_Seller);
                ResultSet rs=getResult(1);
                TableModel SellerModel=new SellerModel(rs);
                SellerTable.setModel(SellerModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(SellerModel);
                SellerTable.setRowSorter(sorter);
            }
        }
        if(Tables.getSelectedComponent()==OrderPanel) {
            int idRowTable = OrderTable.getSelectedRow();
            yesNo = JOptionPane.showOptionDialog(null, "Вы точно хотите удалить этот товар со склада?", "Подтверждение",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, null, null);
            String Status="Заказан";
            if (idRowTable==0 && yesNo==0){
                String ID_Order =(String) OrderTable.getValueAt(0, 0);
                String ID_Goods = (String) OrderTable.getValueAt(0, 7);
                OrderObj.setOrder(ID_Goods);
                OrderObj.updateGoods(Status);
                OrderObj.delOrder(ID_Order);
                ResultSet rs=getResult(5);
                TableModel OrderModel=new OrderModel(rs);
                OrderTable.setModel(OrderModel);
                rs=getResult(4);
                TableModel GoodsModel=new GoodsModel(rs);
                GoodsTable.setModel(GoodsModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(OrderModel);
                OrderTable.setRowSorter(sorter);
            }
            else if (yesNo==0){
                String ID_Order =(String) OrderTable.getValueAt(idRowTable, 0);
                String ID_Goods = (String) OrderTable.getValueAt(idRowTable, 7);
                OrderObj.setOrder(ID_Goods);
                OrderObj.updateGoods(Status);
                OrderObj.delOrder(ID_Order);
                ResultSet rs=getResult(5);
                TableModel OrderModel=new OrderModel(rs);
                OrderTable.setModel(OrderModel);
                rs=getResult(4);
                TableModel GoodsModel=new GoodsModel(rs);
                GoodsTable.setModel(GoodsModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(OrderModel);
                OrderTable.setRowSorter(sorter);
            }
        }
        if(Tables.getSelectedComponent()==BuyerPanel){
            int idRowTable = BuyerTable.getSelectedRow();
            yesNo = JOptionPane.showOptionDialog(null, "Вы точно хотите удалить этого покупателя?", "Подтверждение",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, null, null);
            if (idRowTable==0 && yesNo==0){
                String ID_Client =(String) BuyerTable.getValueAt(0, 0); 
                BuyerObj.delBuyer(ID_Client);
                ResultSet rs=getResult(2);
                TableModel BuyerModel=new BuyerModel(rs);
                BuyerTable.setModel(BuyerModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(BuyerModel);
                BuyerTable.setRowSorter(sorter);
            }
            else if (yesNo==0){
                String ID_Client =(String) BuyerTable.getValueAt(idRowTable, 0);
                BuyerObj.delBuyer(ID_Client);
                ResultSet rs=getResult(2);
                TableModel BuyerModel=new BuyerModel(rs);
                BuyerTable.setModel(BuyerModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(BuyerModel);
                BuyerTable.setRowSorter(sorter);
            }
        }
        if(Tables.getSelectedComponent()==CategoryPanel) {
            int idRowTable = CategoryTable.getSelectedRow();
            yesNo = JOptionPane.showOptionDialog(null, "Вы точно хотите удалить эту категорию?", "Подтверждение",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, null, null);
            if (idRowTable==0 && yesNo==0){
                String ID_Category =(String) CategoryTable.getValueAt(0, 0);
                try {
                    CategoryObj.delCategory(ID_Category);
                } 
                catch (SQLException ex) {
                    Logger.getLogger(Stolica.class.getName()).log(Level.SEVERE, null, ex);
                }
                ResultSet rs=getResult(3);
                TableModel CategoryModel=new CategoryModel(rs);
                CategoryTable.setModel(CategoryModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(CategoryModel);
                CategoryTable.setRowSorter(sorter);
            }
            else if (yesNo==0){
                String ID_Category =(String) CategoryTable.getValueAt(idRowTable, 0);
                try {
                    CategoryObj.delCategory(ID_Category);
                } 
                catch (SQLException ex) {
                    Logger.getLogger(Stolica.class.getName()).log(Level.SEVERE, null, ex);
                }
                ResultSet rs=getResult(3);
                TableModel CategoryModel=new CategoryModel(rs);
                CategoryTable.setModel(CategoryModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(CategoryModel);
                CategoryTable.setRowSorter(sorter);
            }
        }
        if(Tables.getSelectedComponent()==BuysPanel) {
            int idRowTable = BuysTable.getSelectedRow();
            yesNo = JOptionPane.showOptionDialog(null, "Вы точно хотите удалить эту покупку?", "Подтверждение",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, null, null);
            if (idRowTable==0 && yesNo==0){
                String ID_Sell =(String) BuysTable.getValueAt(0, 0);
                BuyGoodsObj.delBuyGoods(ID_Sell);
                ResultSet rs=getResult(6);
                TableModel BuyGoodsModel=new BuyGoodsModel(rs);
                BuysTable.setModel(BuyGoodsModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(BuyGoodsModel);
                BuysTable.setRowSorter(sorter);
            }
            else if (yesNo==0){
                String ID_Sell =(String) BuysTable.getValueAt(idRowTable, 0);
                BuyGoodsObj.delBuyGoods(ID_Sell);
                ResultSet rs=getResult(6);
                TableModel BuyGoodsModel=new BuyGoodsModel(rs);
                BuysTable.setModel(BuyGoodsModel);
                mdbc.close(rs);
                RowSorter<TableModel> sorter =new TableRowSorter<>(BuyGoodsModel);
                BuysTable.setRowSorter(sorter);
            }
        }
        getRow();
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else{
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }    
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String text = SearchField.getText();
        TableRowSorter<TableModel> sorter=new TableRowSorter<>();
        if(Tables.getSelectedComponent()==GoodsPanel) {
            ResultSet rs=getResult(4);
            TableModel GoodsModel=new GoodsModel(rs);
            GoodsTable.setModel(GoodsModel);
            mdbc.close(rs);
            sorter =new TableRowSorter<>(GoodsModel);
            GoodsTable.setRowSorter(sorter);
            getRow();
        }
        if(Tables.getSelectedComponent()==SellerPanel) {
            ResultSet rs=getResult(1);
            TableModel SellerModel=new SellerModel(rs);
            SellerTable.setModel(SellerModel);
            mdbc.close(rs);
            sorter = new TableRowSorter<>(SellerModel);
            SellerTable.setRowSorter(sorter);
            getRow();
        }
        if(Tables.getSelectedComponent()==BuyerPanel) {
            ResultSet rs=getResult(2);
            TableModel BuyerModel=new BuyerModel(rs);
            BuyerTable.setModel(BuyerModel);
            mdbc.close(rs);
            sorter = new TableRowSorter<>(BuyerModel);
            BuyerTable.setRowSorter(sorter);
            getRow();
        }
        if(Tables.getSelectedComponent()==CategoryPanel) {
            ResultSet rs=getResult(3);
            TableModel CategoryModel=new CategoryModel(rs);
            CategoryTable.setModel(CategoryModel);
            mdbc.close(rs);
            sorter = new TableRowSorter<>(CategoryModel);
            CategoryTable.setRowSorter(sorter);
            getRow();
        }
        if(Tables.getSelectedComponent()==OrderPanel) {
            ResultSet rs=getResult(5);
            TableModel OrderModel=new OrderModel(rs);
            OrderTable.setModel(OrderModel);
            mdbc.close(rs);
            sorter = new TableRowSorter<>(OrderModel);
            OrderTable.setRowSorter(sorter);
            getRow();
        }
        if(Tables.getSelectedComponent()==BuysPanel) {
            ResultSet rs=getResult(6);
            TableModel BuyGoodsModel=new BuyGoodsModel(rs);
            BuysTable.setModel(BuyGoodsModel);
            mdbc.close(rs);
            sorter = new TableRowSorter<>(BuyGoodsModel);
            BuysTable.setRowSorter(sorter);
            getRow();
        }
        if (text.length() == 0) {
            sorter.setRowFilter(null);
            } 
        else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter(text));
            } 
            catch (PatternSyntaxException pse) {
                System.err.println("Bad regex pattern");
            }
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void AddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCategoryActionPerformed
        if (NameNameCategoryFieldCheck!=1){
            JOptionPane.showMessageDialog(AddCategory, "Не правильно заполнено поле или поля", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            String NameCategory=NameCategoryField.getText();
            if (Control == 0){
                CategoryObj.addCategory(NameCategory);
            }
            else{
                int idRowTable = CategoryTable.getSelectedRow();
                String ID_Category =(String) CategoryTable.getValueAt(idRowTable, 0);
                CategoryObj.updateCategory(ID_Category, NameCategory); 
            }
            ResultSet rs=getResult(3);
            TableModel CategoryModel=new CategoryModel(rs);
            CategoryTable.setModel(CategoryModel);
            mdbc.close(rs);
            RowSorter<TableModel> sorter =new TableRowSorter<>(CategoryModel);
            CategoryTable.setRowSorter(sorter);
            Add.setEnabled(true);
            Delete.setEnabled(true);
            Update.setEnabled(true);
            MenuAdd.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            Tables.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
            ButtonsCategory.setVisible(false);
            this.setSize(1374,397);
            if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
            {
                Update.setEnabled(false);
                Delete.setEnabled(false);
                MenuEdit.setEnabled(false);
                MenuDelete.setEnabled(false);
                SearchField.setEnabled(false);
                Search.setEnabled(false);
            }
            else
            {
                Update.setEnabled(true);
                Delete.setEnabled(true);
                MenuEdit.setEnabled(true);
                MenuDelete.setEnabled(true);
                SearchField.setEnabled(true);
                Search.setEnabled(true);
            }    
        }
        getRow();
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
    }//GEN-LAST:event_AddCategoryActionPerformed
    
    private void getRow()
    {
        if (GoodsTable.getRowCount()>0)
            GoodsTable.setRowSelectionInterval(0, 0);
        if (SellerTable.getRowCount()>0)
            SellerTable.setRowSelectionInterval(0, 0);
        if (BuyerTable.getRowCount()>0)
            BuyerTable.setRowSelectionInterval(0, 0);
        if (CategoryTable.getRowCount()>0)
            CategoryTable.setRowSelectionInterval(0, 0);
        if (BuysTable.getRowCount()>0)
            BuysTable.setRowSelectionInterval(0, 0);
        if (OrderTable.getRowCount()>0)
            OrderTable.setRowSelectionInterval(0, 0);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getRow();
        if (GoodsTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }    
        if (SellerTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        } 
        if (BuyerTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        } 
        if (CategoryTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        } 
        if (BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        } 
        if (OrderTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        } 
        ButtonsGoods.setVisible(false);
        ButtonsSeller.setVisible(false);
        ButtonsBuyer.setVisible(false);
        ButtonsCategory.setVisible(false);
        ButtonsBuys.setVisible(false);
        ButtonsOrder.setVisible(false);
        this.setSize(1374,397);
        
    }//GEN-LAST:event_formWindowOpened

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        Control = 0;
        if(Tables.getSelectedComponent()==GoodsPanel) {ButtonsGoods.setVisible(true);this.setSize(1374,524);}
        if(Tables.getSelectedComponent()==SellerPanel) {ButtonsSeller.setVisible(true);this.setSize(1374,577);}
        if(Tables.getSelectedComponent()==BuyerPanel) {ButtonsBuyer.setVisible(true);this.setSize(1374,530);}
        if(Tables.getSelectedComponent()==CategoryPanel) {ButtonsCategory.setVisible(true);this.setSize(1374,469);}
        if(Tables.getSelectedComponent()==BuysPanel) {ButtonsBuys.setVisible(true);this.setSize(1374,476); }
        String queryOrder = "SELECT ID_Goods FROM kind_goods where Status = 'Заказан'";
        ComboGoodsID.removeAllItems();
        addToCbb(ComboGoodsID, queryOrder);
        if(Tables.getSelectedComponent()==OrderPanel && ComboGoodsID.getSelectedIndex()>-1) {ButtonsOrder.setVisible(true);setSize(1374,529); }
        else if (Tables.getSelectedComponent()==OrderPanel && ComboGoodsID.getSelectedIndex()<0 ){
             JOptionPane.showMessageDialog(AddGoods, "Нет заказанных товаров", "Ошибка", JOptionPane.WARNING_MESSAGE);
             //return;
        }
        if (true){
            Add.setEnabled(false);
            Delete.setEnabled(false);
            Update.setEnabled(false);
            Tables.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
            GoodsTable.setEnabled(false);
            SellerTable.setEnabled(false);
            BuyerTable.setEnabled(false);
            BuysTable.setEnabled(false);
            CategoryTable.setEnabled(false);
            OrderTable.setEnabled(false);
            Menu.setEnabled(false);
            Add.setBorder(new LineBorder(Color.blue, 1, true));
            String querySeller = "SELECT Seller FROM seller_firm";
            String queryCategory = "SELECT NameCategory FROM category";
            String queryBuyer = "SELECT client FROM buyer_firm";
            String queryGoods = "SELECT Goods FROM order_goods";
            if(Tables.getSelectedComponent()==GoodsPanel) {
                ComboSeller.removeAllItems();
                ComboCategory.removeAllItems();
                addToCbb(ComboSeller, querySeller);
                addToCbb(ComboCategory, queryCategory);
                GoodsField.setText("");    GoodsField.setBorder(new LineBorder(Color.RED, 0));
                ManufacturerField.setText("");ManufacturerField.setBorder(new LineBorder(Color.RED, 0));
                CostUnitField.setText("");CostUnitField.setBorder(new LineBorder(Color.RED, 0));
                CountField.setText("");CountField.setBorder(new LineBorder(Color.RED, 0));
            }
            if(Tables.getSelectedComponent()==OrderPanel && ComboGoodsID.getSelectedIndex()>-1) {
                ComboGoodsID.removeAllItems();
                addToCbb(ComboGoodsID, queryOrder);
                DateStartField.setText("");DateStartField.setBorder(new LineBorder(Color.RED, 0));
                PeriodField.setText("");PeriodField.setBorder(new LineBorder(Color.RED, 0));  
                GoodsIDField.setText("");GoodsIDField.setBorder(new LineBorder(Color.RED, 0));
                String itemGoods = (String) ComboGoodsID.getSelectedItem();
                OrderObj.setOrder(itemGoods);
                String Goods = OrderObj.Goods();
                int Count = OrderObj.Count();
                String CategoryOrder=OrderObj.CategoryOrder(); 
                if (ComboGoodsID.getSelectedIndex()>-1){
                    GoodsOrderField.setText(Goods);
                    CountOrderField.setText(Integer.toString(Count));
                    CategoryOrderField.setText(CategoryOrder);
                }  
            }
            if(Tables.getSelectedComponent()==SellerPanel) {
                SellerField.setText("");SellerField.setBorder(new LineBorder(Color.RED, 0));
                AddressField.setText("");AddressField.setBorder(new LineBorder(Color.RED, 0));
                BankField.setText("");BankField.setBorder(new LineBorder(Color.RED, 0));
                InnSellerField.setText("");InnSellerField.setBorder(new LineBorder(Color.RED, 0)); 
                PhoneField.setText("");PhoneField.setBorder(new LineBorder(Color.RED, 0));
                AccountField.setText("");AccountField.setBorder(new LineBorder(Color.RED, 0));
                CountryField.setText("");CountryField.setBorder(new LineBorder(Color.RED, 0));
                ManagerField.setText("");ManagerField.setBorder(new LineBorder(Color.RED, 0));
                ChiefField.setText("");ChiefField.setBorder(new LineBorder(Color.RED, 0));
                PhonePlusField.setText("");PhonePlusField.setBorder(new LineBorder(Color.RED, 0));
            }
            if(Tables.getSelectedComponent()==BuyerPanel) {
                AddressClientField.setText("");AddressClientField.setBorder(new LineBorder(Color.RED, 0));
                ClientField.setText("");ClientField.setBorder(new LineBorder(Color.RED, 0));
                PhoneDirField.setText("");PhoneDirField.setBorder(new LineBorder(Color.RED, 0));
                InnClientField.setText("");  InnClientField.setBorder(new LineBorder(Color.RED, 0)); 
                CountryClientField.setText("");CountryClientField.setBorder(new LineBorder(Color.RED, 0));
                BankClientField.setText("");BankClientField.setBorder(new LineBorder(Color.RED, 0));
                DirectorField.setText("");DirectorField.setBorder(new LineBorder(Color.RED, 0));
                AccountClientField.setText("");AccountClientField.setBorder(new LineBorder(Color.RED, 0));
            }
            if(Tables.getSelectedComponent()==CategoryPanel) {
                NameCategoryField.setText("");NameCategoryField.setBorder(new LineBorder(Color.RED, 0));
            }
            if(Tables.getSelectedComponent()==BuysPanel) {
                ComboGoods.removeAllItems();
                ComboBuyer.removeAllItems();
                addToCbb(ComboGoods, queryGoods);
                addToCbb(ComboBuyer, queryBuyer);
                VolumeField.setText("");VolumeField.setBorder(new LineBorder(Color.RED, 0));
                CostUnitVolField.setText("");CostUnitVolField.setBorder(new LineBorder(Color.RED, 0));
                String itemOrder = (String) ComboGoods.getSelectedItem();
                String itemBuyer = (String) ComboBuyer.getSelectedItem();
                String itemGoods = (String) ComboGoods.getSelectedItem();
                BuyGoodsObj.setBuyGoods(itemGoods, itemOrder, itemBuyer);
                double CostUnit=BuyGoodsObj.CostUnit();
                double Recommm =  CostUnit*1.3;
                if (ComboGoods.getSelectedIndex()>-1){
                    CostGoods.setText(Integer.toString(BuyGoodsObj.Count())+" штук товаров на складе по цене " + Double.toString(BuyGoodsObj.CostUnit()) +" за штуку. Рекомендуемая цена "+ Recommm+ " руб.");
                }
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void AddGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGoodsActionPerformed
        if (GoodsFieldCheck!=1 || ManufacturerFieldCheck!=1 || CostUnitFieldCheck!=1 || CountFieldCheck!=1)
        {
            JOptionPane.showMessageDialog(AddGoods, "Не правильно заполнено поле или поля", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            String Goods=GoodsField.getText();
            String Manufacturer=ManufacturerField.getText();
            String Unit=(String) UnitField.getSelectedItem();
            String DateKind = null;
            try {
                DateKind = DateFormat(DateToday());
            } 
            catch (ParseException ex) {
                Logger.getLogger(Stolica.class.getName()).log(Level.SEVERE, null, ex);
            }
            double CostUnit=Double.valueOf(CostUnitField.getText());
            int Count=Integer.valueOf(CountField.getText());
            double AllCost= CostUnit*Count;
            String StatusAdd="Заказан";
            String StatusUpdate=StatusCheck;
            String itemSeller = (String) ComboSeller.getSelectedItem();
            String itemCategory = (String) ComboCategory.getSelectedItem();
            if (Control==0){
                GoodsObj.setGoods(itemSeller, itemCategory);
                GoodsObj.addGoods(Goods, Manufacturer, Unit, CostUnit, Count, AllCost, DateKind, StatusAdd);
            }
            else{
                int idRowTable = GoodsTable.getSelectedRow();
                String ID_Goods =(String) GoodsTable.getValueAt(idRowTable, 0);
                GoodsObj.setGoods(itemSeller, itemCategory);
                GoodsObj.updateGoods(ID_Goods,Goods, Manufacturer, Unit, CostUnit, Count, AllCost, DateKind, StatusUpdate); 
            }   
            ResultSet rs=getResult(4);
            TableModel GoodsModel=new GoodsModel(rs);
            GoodsTable.setModel(GoodsModel);
            mdbc.close(rs);
            RowSorter<TableModel> sorter =new TableRowSorter<>(GoodsModel);
            GoodsTable.setRowSorter(sorter);
            Add.setEnabled(true);
            Delete.setEnabled(true);
            Update.setEnabled(true);
            Tables.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
            ButtonsGoods.setVisible(false);
            GoodsTable.setEnabled(true);
            SellerTable.setEnabled(true);
            BuyerTable.setEnabled(true);
            BuysTable.setEnabled(true);
            CategoryTable.setEnabled(true);
            OrderTable.setEnabled(true);
            Menu.setEnabled(true);
            getRow();
            this.setSize(1374,397);
        }
        getRow();
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }    
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
    }//GEN-LAST:event_AddGoodsActionPerformed

    private void CancelCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelCategoryActionPerformed
        Add.setEnabled(true);
        Delete.setEnabled(true);
        Update.setEnabled(true);
        Tables.setEnabled(true);
        SearchField.setEnabled(true);
        Search.setEnabled(true);
        ButtonsCategory.setVisible(false);
        this.setSize(1374,397);
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else{
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }    
    }//GEN-LAST:event_CancelCategoryActionPerformed

    private void CancelGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelGoodsActionPerformed
        Add.setEnabled(true);
        Delete.setEnabled(true);
        Update.setEnabled(true);
        Tables.setEnabled(true);
        SearchField.setEnabled(true);
        Search.setEnabled(true);
        ButtonsGoods.setVisible(false);
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        this.setSize(1374,397);
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else{
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }     
    }//GEN-LAST:event_CancelGoodsActionPerformed

    private void AddSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSellerActionPerformed
        if (SellerFieldCheck!=1 || InnSellerFieldCheck!=1 || CountryFieldFieldCheck!=1 || ChiefFieldFieldCheck!=1
                 || AddressFieldFieldCheck!=1 || PhoneFieldFieldCheck!=1 || ManagerFieldFieldCheck!=1 || PhonePlusFieldCheck!=1
                || BankFieldCheck!=1 || AccountFieldCheck!=1)
        {
            JOptionPane.showMessageDialog(AddSeller, "Не правильно заполнено поле или поля", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
            String Seller=SellerField.getText();
            long InnSeller=Long.valueOf(InnSellerField.getText());
            String Country=CountryField.getText();
            String Chief=ChiefField.getText();
            String Address=AddressField.getText();
            String Phone=PhoneField.getText();
            String Manager=ManagerField.getText();
            String PhonePlus=PhonePlusField.getText();
            String Bank=BankField.getText();
            String Account=AccountField.getText();
            if (Control == 0)
            SellerObj.addSeller(Seller, InnSeller, Country, Chief, Address, Phone, Manager, PhonePlus, Bank, Account);
            else {
                int idRowTable = SellerTable.getSelectedRow();
                String ID_Seller =(String) SellerTable.getValueAt(idRowTable, 0);
                SellerObj.updateSeller(ID_Seller, Seller, InnSeller, Country, Chief, Address, Phone, Manager, PhonePlus, Bank, Account);
            }
            ResultSet rs=getResult(1);
            TableModel SellerModel=new SellerModel(rs);
            SellerTable.setModel(SellerModel);
            mdbc.close(rs);
            RowSorter<TableModel> sorter =new TableRowSorter<>(SellerModel);
            SellerTable.setRowSorter(sorter);
            Add.setEnabled(true);
            Delete.setEnabled(true);
            Update.setEnabled(true);
            Tables.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
            ButtonsSeller.setVisible(false);
            this.setSize(1374,397);
        }
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }    
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
    }//GEN-LAST:event_AddSellerActionPerformed

    private void CancelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelFieldActionPerformed
        Add.setEnabled(true);
        Delete.setEnabled(true);
        Update.setEnabled(true);
        Tables.setEnabled(true);
        SearchField.setEnabled(true);
        Search.setEnabled(true);
        ButtonsSeller.setVisible(false);
        this.setSize(1374,397);
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else{
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }                
    }//GEN-LAST:event_CancelFieldActionPerformed

    private void AddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClientActionPerformed
        if (ClientFieldCheck!=1 || InnClientFieldCheck!=1 || CountryClientFieldCheck!=1 || DirectorFieldCheck!=1
                 || AddressClientFieldCheck!=1|| PhoneDirFieldCheck!=1|| BankClientFieldCheck!=1|| AccountClientFieldCheck!=1)
        {
            JOptionPane.showMessageDialog(AddClient, "Не правильно заполнено поле или поля", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            String Client=ClientField.getText();
            long InnClient=Long.valueOf(InnClientField.getText());
            String CountryClient=CountryClientField.getText();
            String Director=DirectorField.getText();
            String AddressClient=AddressClientField.getText();
            String PhoneDir=PhoneDirField.getText();
            String BankClient=BankClientField.getText();
            String AccountClient=AccountClientField.getText();
            if (Control == 0)
                BuyerObj.addBuyer(Client, InnClient, CountryClient, Director, AddressClient, PhoneDir, BankClient, AccountClient);
            else
            {
                int idRowTable = BuyerTable.getSelectedRow();
                String ID_Client =(String) BuyerTable.getValueAt(idRowTable, 0);
                BuyerObj.updateBuyer(ID_Client, Client, InnClient, CountryClient, Director, AddressClient, PhoneDir, BankClient, AccountClient);
            }
            ResultSet rs=getResult(2);
            TableModel BuyerModel=new BuyerModel(rs);
            BuyerTable.setModel(BuyerModel);
            mdbc.close(rs);
            RowSorter<TableModel> sorter =new TableRowSorter<>(BuyerModel);
            BuyerTable.setRowSorter(sorter);
            Add.setEnabled(true);
            Delete.setEnabled(true);
            Update.setEnabled(true);
            Tables.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
            ButtonsBuyer.setVisible(false);
            this.setSize(1374,397);
        }
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else{
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }    
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
    }//GEN-LAST:event_AddClientActionPerformed

    private void CancelClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelClientActionPerformed
        Add.setEnabled(true);
        Delete.setEnabled(true);
        Update.setEnabled(true);
        Tables.setEnabled(true);
        SearchField.setEnabled(true);
        Search.setEnabled(true);
        ButtonsBuyer.setVisible(false);
        this.setSize(1374,397);
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }             
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
    }//GEN-LAST:event_CancelClientActionPerformed

    private void GoodsFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_GoodsFieldCaretUpdate
        String str = GoodsField.getText();
        if (Check.checkName(str)==true)
        {
            GoodsField.setBorder(new LineBorder(Color.GREEN, 2));
            GoodsFieldCheck=1;
        }
        else 
        {
            GoodsField.setBorder(new LineBorder(Color.RED, 2));
            GoodsFieldCheck=0;
        }
    }//GEN-LAST:event_GoodsFieldCaretUpdate

    private void ManufacturerFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_ManufacturerFieldCaretUpdate
         String str = ManufacturerField.getText();
        if (Check.checkName(str)==true)
        {
            ManufacturerField.setBorder(new LineBorder(Color.GREEN, 2));
            ManufacturerFieldCheck=1;
        }
        else 
        {
            ManufacturerField.setBorder(new LineBorder(Color.RED, 2));
            ManufacturerFieldCheck=0;
        }
    }//GEN-LAST:event_ManufacturerFieldCaretUpdate

    private void CostUnitFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CostUnitFieldCaretUpdate
       String str = CostUnitField.getText();
        if (Check.checkCost(str)==true)
        {
            CostUnitField.setBorder(new LineBorder(Color.GREEN, 2));
            CostUnitFieldCheck=1;
        }
        else 
        {
            CostUnitField.setBorder(new LineBorder(Color.RED, 2));
            CostUnitFieldCheck=0;
        }
    }//GEN-LAST:event_CostUnitFieldCaretUpdate

    private void CountFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CountFieldCaretUpdate
      String str = CountField.getText();
        if (Check.checkPeriod(str)==true)
        {
            CountField.setBorder(new LineBorder(Color.GREEN, 2));
            CountFieldCheck=1;
        }
        else 
        {
            CountField.setBorder(new LineBorder(Color.RED, 2));
            CountFieldCheck=1;
        }
    }//GEN-LAST:event_CountFieldCaretUpdate

    private void SellerFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_SellerFieldCaretUpdate
        String str = SellerField.getText();
        if (Check.checkName(str)==true)
        {
            SellerField.setBorder(new LineBorder(Color.GREEN, 2));
            SellerFieldCheck=1;
        }
        else 
        {
            SellerField.setBorder(new LineBorder(Color.RED, 2));
            SellerFieldCheck=0;
        } 
    }//GEN-LAST:event_SellerFieldCaretUpdate

    private void InnSellerFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_InnSellerFieldCaretUpdate
        String str = InnSellerField.getText();
        if (Check.checkGoodsID(str)==true)
        {
            InnSellerField.setBorder(new LineBorder(Color.GREEN, 2));
            InnSellerFieldCheck=1;
        }
        else 
        {
            InnSellerField.setBorder(new LineBorder(Color.RED, 2));
            InnSellerFieldCheck=0;
        } 
    }//GEN-LAST:event_InnSellerFieldCaretUpdate

    private void CountryFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CountryFieldCaretUpdate
        String str = CountryField.getText();
        if (Check.checkCountry(str)==true)
        {
            CountryField.setBorder(new LineBorder(Color.GREEN, 2));
            CountryFieldFieldCheck=1;
        }
        else 
        {
            CountryField.setBorder(new LineBorder(Color.RED, 2));
            CountryFieldFieldCheck=0;
        } 
    }//GEN-LAST:event_CountryFieldCaretUpdate

    private void ChiefFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_ChiefFieldCaretUpdate
        String str = ChiefField.getText();
        if (Check.checkName(str)==true)
        {
            ChiefField.setBorder(new LineBorder(Color.GREEN, 2));
            ChiefFieldFieldCheck=1;
        }
        else 
        {
            ChiefField.setBorder(new LineBorder(Color.RED, 2));
            ChiefFieldFieldCheck=0;
        } 
    }//GEN-LAST:event_ChiefFieldCaretUpdate

    private void AddressFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AddressFieldCaretUpdate
        String str = AddressField.getText();
        if (Check.checkAddress(str)==true)
        {
            AddressField.setBorder(new LineBorder(Color.GREEN, 2));
            AddressFieldFieldCheck=1;
        }
        else 
        {
            AddressField.setBorder(new LineBorder(Color.RED, 2));
            AddressFieldFieldCheck=0;
        } 
    }//GEN-LAST:event_AddressFieldCaretUpdate

    private void PhoneFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PhoneFieldCaretUpdate
        String str = PhoneField.getText();
        if (Check.checkPhone(str)==true)
        {
            PhoneField.setBorder(new LineBorder(Color.GREEN, 2));
            PhoneFieldFieldCheck=1;
        }
        else 
        {
            PhoneField.setBorder(new LineBorder(Color.RED, 2));
            PhoneFieldFieldCheck=0;
        } 
    }//GEN-LAST:event_PhoneFieldCaretUpdate

    private void ManagerFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_ManagerFieldCaretUpdate
        String str = ManagerField.getText();
        if (Check.checkName(str)==true)
        {
            ManagerField.setBorder(new LineBorder(Color.GREEN, 2));
            ManagerFieldFieldCheck=1;
        }
        else 
        {
            ManagerField.setBorder(new LineBorder(Color.RED, 2));
            ManagerFieldFieldCheck=0;
        } 
    }//GEN-LAST:event_ManagerFieldCaretUpdate

    private void PhonePlusFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PhonePlusFieldCaretUpdate
        String str = PhonePlusField.getText();
        if (Check.checkPhone(str)==true)
        {
            PhonePlusField.setBorder(new LineBorder(Color.GREEN, 2));
            PhonePlusFieldCheck=1;
        }
        else 
        {
            PhonePlusField.setBorder(new LineBorder(Color.RED, 2));
            PhonePlusFieldCheck=0;
        } 
    }//GEN-LAST:event_PhonePlusFieldCaretUpdate

    private void BankFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_BankFieldCaretUpdate
        String str = BankField.getText();
        if (Check.checkName(str)==true)
        {
            BankField.setBorder(new LineBorder(Color.GREEN, 2));
            BankFieldCheck=1;
        }
        else 
        {
            BankField.setBorder(new LineBorder(Color.RED, 2));
            BankFieldCheck=0;
        } 
    }//GEN-LAST:event_BankFieldCaretUpdate

    private void AccountFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AccountFieldCaretUpdate
        String str = AccountField.getText();
        if (Check.checkAccount(str)==true)
        {
            AccountField.setBorder(new LineBorder(Color.GREEN, 2));
            AccountFieldCheck=1;
        }
        else 
        {
            AccountField.setBorder(new LineBorder(Color.RED, 2));
            AccountFieldCheck=0;
        } 
    }//GEN-LAST:event_AccountFieldCaretUpdate

    private void ClientFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_ClientFieldCaretUpdate
        String str = ClientField.getText();
        if (Check.checkName(str)==true)
        {
            ClientField.setBorder(new LineBorder(Color.GREEN, 2));
            ClientFieldCheck=1;
        }
        else 
        {
            ClientField.setBorder(new LineBorder(Color.RED, 2));
            ClientFieldCheck=0;
        } 
    }//GEN-LAST:event_ClientFieldCaretUpdate

    private void InnClientFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_InnClientFieldCaretUpdate
        String str = InnClientField.getText();
        if (Check.checkGoodsID(str)==true)
        {
            InnClientField.setBorder(new LineBorder(Color.GREEN, 2));
            InnClientFieldCheck=1;
        }
        else 
        {
            InnClientField.setBorder(new LineBorder(Color.RED, 2));
            InnClientFieldCheck=0;
        } 
    }//GEN-LAST:event_InnClientFieldCaretUpdate

    private void CountryClientFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CountryClientFieldCaretUpdate
        String str = CountryClientField.getText();
        if (Check.checkCountry(str)==true)
        {
            CountryClientField.setBorder(new LineBorder(Color.GREEN, 2));
            CountryClientFieldCheck=1;
        }
        else 
        {
            CountryClientField.setBorder(new LineBorder(Color.RED, 2));
            CountryClientFieldCheck=0;
        } 
    }//GEN-LAST:event_CountryClientFieldCaretUpdate

    private void DirectorFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_DirectorFieldCaretUpdate
        String str = DirectorField.getText();
        if (Check.checkName(str)==true)
        {
            DirectorField.setBorder(new LineBorder(Color.GREEN, 2));
            DirectorFieldCheck=1;
        }
        else 
        {
            DirectorField.setBorder(new LineBorder(Color.RED, 2));
            DirectorFieldCheck=0;
        } 
    }//GEN-LAST:event_DirectorFieldCaretUpdate

    private void AddressClientFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AddressClientFieldCaretUpdate
        String str = AddressClientField.getText();
        if (Check.checkAddress(str)==true)
        {
            AddressClientField.setBorder(new LineBorder(Color.GREEN, 2));
            AddressClientFieldCheck=1;
        }
        else 
        {
            AddressClientField.setBorder(new LineBorder(Color.RED, 2));
            AddressClientFieldCheck=0;
        } 
    }//GEN-LAST:event_AddressClientFieldCaretUpdate

    private void PhoneDirFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PhoneDirFieldCaretUpdate
        String str = PhoneDirField.getText();
        if (Check.checkPhone(str)==true)
        {
            PhoneDirField.setBorder(new LineBorder(Color.GREEN, 2));
            PhoneDirFieldCheck=1;
        }
        else 
        {
            PhoneDirField.setBorder(new LineBorder(Color.RED, 2));
            PhoneDirFieldCheck=0;
        } 
    }//GEN-LAST:event_PhoneDirFieldCaretUpdate

    private void BankClientFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_BankClientFieldCaretUpdate
        String str = BankClientField.getText();
        if (Check.checkName(str)==true)
        {
            BankClientField.setBorder(new LineBorder(Color.GREEN, 2));
            BankClientFieldCheck=1;
        }
        else 
        {
            BankClientField.setBorder(new LineBorder(Color.RED, 2));
            BankClientFieldCheck=0;
        } 
    }//GEN-LAST:event_BankClientFieldCaretUpdate

    private void AccountClientFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AccountClientFieldCaretUpdate
        String str = AccountClientField.getText();
        if (Check.checkAccount(str)==true)
        {
            AccountClientField.setBorder(new LineBorder(Color.GREEN, 2));
            AccountClientFieldCheck=1;
        }
        else 
        {
            AccountClientField.setBorder(new LineBorder(Color.RED, 2));
            AccountClientFieldCheck=0;
        } 
    }//GEN-LAST:event_AccountClientFieldCaretUpdate

    private void NameCategoryFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NameCategoryFieldCaretUpdate

        String str = NameCategoryField.getText();
        if (Check.checkName(str)==true)
        {
            NameCategoryField.setBorder(new LineBorder(Color.GREEN, 2));
            NameNameCategoryFieldCheck=1;
        }
        else 
        {
            NameCategoryField.setBorder(new LineBorder(Color.RED, 2));
            NameNameCategoryFieldCheck=0;
        } 
    }//GEN-LAST:event_NameCategoryFieldCaretUpdate

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        formWindowClosing(null);
    }//GEN-LAST:event_formWindowClosed

    private void MenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeleteActionPerformed
        DeleteActionPerformed(evt);
    }//GEN-LAST:event_MenuDeleteActionPerformed

    private void MenuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEditActionPerformed
        UpdateActionPerformed(evt);
    }//GEN-LAST:event_MenuEditActionPerformed

    private void MenuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddActionPerformed
        AddActionPerformed(evt);
    }//GEN-LAST:event_MenuAddActionPerformed

    private void AddMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseMoved
        if(Tables.getSelectedComponent()==GoodsPanel) {StatusBar.setText("Добавить новую закупку товара в таблицу");}
        if(Tables.getSelectedComponent()==SellerPanel) {StatusBar.setText("Добавить нового продавца в таблицу");}
        if(Tables.getSelectedComponent()==BuyerPanel) {StatusBar.setText("Добавить нового покупателя в таблицу");}
        if(Tables.getSelectedComponent()==CategoryPanel) {StatusBar.setText("Добавить новую категорию в таблицу");}
        if(Tables.getSelectedComponent()==BuysPanel) {StatusBar.setText("Добавить новую продажу в таблицу");}
    }//GEN-LAST:event_AddMouseMoved

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        StatusBar.setText("");
    }//GEN-LAST:event_AddMouseExited

    private void UpdateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseMoved
        if(Tables.getSelectedComponent()==GoodsPanel) {StatusBar.setText("Редактировать существующую закупку товара");}
        if(Tables.getSelectedComponent()==SellerPanel) {StatusBar.setText("Редактировать существующего продавца");}
        if(Tables.getSelectedComponent()==BuyerPanel) {StatusBar.setText("Редактировать существующего покупателя");}
        if(Tables.getSelectedComponent()==CategoryPanel) {StatusBar.setText("Редактировать существующую категорию");}
        if(Tables.getSelectedComponent()==BuysPanel) {StatusBar.setText("Редактировать существующую продажу");}
    }//GEN-LAST:event_UpdateMouseMoved

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        StatusBar.setText("");
    }//GEN-LAST:event_UpdateMouseExited

    private void DeleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseMoved
        if(Tables.getSelectedComponent()==GoodsPanel) {StatusBar.setText("Удалить существующую закупку товара");}
        if(Tables.getSelectedComponent()==SellerPanel) {StatusBar.setText("Удалить существующего продавца");}
        if(Tables.getSelectedComponent()==BuyerPanel) {StatusBar.setText("Удалить существующего покупателя");}
        if(Tables.getSelectedComponent()==CategoryPanel) {StatusBar.setText("Удалить существующую категорию");}
        if(Tables.getSelectedComponent()==BuysPanel) {StatusBar.setText("Удалить существующую продажу");}
    }//GEN-LAST:event_DeleteMouseMoved

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        StatusBar.setText("");
    }//GEN-LAST:event_DeleteMouseExited

    private void TablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablesMouseClicked
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled (false);
            MenuDelete.setEnabled (false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled (true);
            MenuDelete.setEnabled (true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }    
        if (Tables.getSelectedComponent()==CostPanel)
        {
            Add.setEnabled(false);
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuAdd.setEnabled(false);
            MenuEdit.setEnabled (false);
            MenuDelete.setEnabled (false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
    }//GEN-LAST:event_TablesMouseClicked

    private void CountFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountFieldMouseMoved
        StatusBar.setText("Введите количество товара");
    }//GEN-LAST:event_CountFieldMouseMoved

    private void AddGoodsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddGoodsMouseMoved
        StatusBar.setText("Сохранить товар в таблицу");
    }//GEN-LAST:event_AddGoodsMouseMoved

    private void CancelGoodsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelGoodsMouseMoved
        StatusBar.setText("Отменить действия с товаром");
    }//GEN-LAST:event_CancelGoodsMouseMoved

    private void ChiefFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChiefFieldMouseMoved
        StatusBar.setText("Введите ФИО директора фирмы-продавца");
    }//GEN-LAST:event_ChiefFieldMouseMoved

    private void PhonePlusFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhonePlusFieldMouseMoved
        StatusBar.setText("Введите номер телефона отдела продаж фирмы-продавца");
    }//GEN-LAST:event_PhonePlusFieldMouseMoved

    private void AddSellerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSellerMouseMoved
        StatusBar.setText("Сохранить фирму-продавца в таблицу");
    }//GEN-LAST:event_AddSellerMouseMoved

    private void CancelFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelFieldMouseMoved
        StatusBar.setText("Отменить действие с фирмой-продавцом");
    }//GEN-LAST:event_CancelFieldMouseMoved

    private void AddClientMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddClientMouseMoved
        StatusBar.setText("Сохранить фирму-покупателя в таблицу");
    }//GEN-LAST:event_AddClientMouseMoved

    private void CancelClientMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelClientMouseMoved
        StatusBar.setText("Отменить действие с фирмой-продавцом");
    }//GEN-LAST:event_CancelClientMouseMoved

    private void AddCategoryMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCategoryMouseMoved
        StatusBar.setText("Сохранить категорию товара в таблицу");
    }//GEN-LAST:event_AddCategoryMouseMoved

    private void CancelCategoryMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelCategoryMouseMoved
        StatusBar.setText("Отменить действие с категорией");
    }//GEN-LAST:event_CancelCategoryMouseMoved

    private void SearchFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFieldMouseMoved
        StatusBar.setText("Введите данные для поиска");
    }//GEN-LAST:event_SearchFieldMouseMoved

    private void SearchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseMoved
        StatusBar.setText("Осуществить поиск");
    }//GEN-LAST:event_SearchMouseMoved

    private void CountFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountFieldMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_CountFieldMouseExited

    private void AddGoodsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddGoodsMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_AddGoodsMouseExited

    private void CancelGoodsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelGoodsMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_CancelGoodsMouseExited

    private void SearchFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFieldMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_SearchFieldMouseExited

    private void SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_SearchMouseExited

    private void ChiefFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChiefFieldMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_ChiefFieldMouseExited

    private void PhonePlusFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhonePlusFieldMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_PhonePlusFieldMouseExited

    private void AddSellerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSellerMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_AddSellerMouseExited

    private void CancelFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelFieldMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_CancelFieldMouseExited

    private void AddClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddClientMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_AddClientMouseExited

    private void CancelClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelClientMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_CancelClientMouseExited

    private void AddCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCategoryMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_AddCategoryMouseExited

    private void CancelCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelCategoryMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_CancelCategoryMouseExited

    private void MenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitMouseClicked
        int response = JOptionPane.showOptionDialog(null, "Вы точно хотите выйти из приложения?", "Подтверждение", JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(response == JOptionPane.YES_OPTION){
            System.exit(0);
            mdbc.close(stmt);
            mdbc.destroy();
        }
    }//GEN-LAST:event_MenuExitMouseClicked

    private void GoodsFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GoodsFieldFocusGained
        StatusBar.setText("Введите наименование товара");
    }//GEN-LAST:event_GoodsFieldFocusGained

    private void ManufacturerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManufacturerFieldFocusGained
        StatusBar.setText("Введите компанию-изготовитель товара");
    }//GEN-LAST:event_ManufacturerFieldFocusGained

    private void CostUnitFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CostUnitFieldFocusGained
        StatusBar.setText("Введите цену за еденицу измерения в рублях");
    }//GEN-LAST:event_CostUnitFieldFocusGained

    private void CountFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CountFieldFocusGained
        StatusBar.setText("Введите количество товара");
    }//GEN-LAST:event_CountFieldFocusGained

    private void ComboSellerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboSellerFocusGained
        StatusBar.setText("Выбирете фирму-продавца");
    }//GEN-LAST:event_ComboSellerFocusGained

    private void ComboCategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboCategoryFocusGained
        StatusBar.setText("Выберите категорию товара");
    }//GEN-LAST:event_ComboCategoryFocusGained

    private void SellerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SellerFieldFocusGained
        StatusBar.setText("Введите наименование фирмы-продавца");
    }//GEN-LAST:event_SellerFieldFocusGained

    private void InnSellerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InnSellerFieldFocusGained
        StatusBar.setText("Введите ИНН фирмы-продавца");
    }//GEN-LAST:event_InnSellerFieldFocusGained

    private void CountryFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CountryFieldFocusGained
        StatusBar.setText("Введите страну фирмы-продавца");
    }//GEN-LAST:event_CountryFieldFocusGained

    private void ChiefFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ChiefFieldFocusGained
        StatusBar.setText("Введите ФИО директора фирмы-продавца");
    }//GEN-LAST:event_ChiefFieldFocusGained

    private void AddressFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressFieldFocusGained
        StatusBar.setText("Введите адрес фирмы-продавца");
    }//GEN-LAST:event_AddressFieldFocusGained

    private void PhoneFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneFieldFocusGained
        StatusBar.setText("Введите номер телефона фирмы-продавца (11 цифр)");
    }//GEN-LAST:event_PhoneFieldFocusGained

    private void ManagerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManagerFieldFocusGained
        StatusBar.setText("Введите ФИО менеджера фирмы-продавца");
    }//GEN-LAST:event_ManagerFieldFocusGained

    private void PhonePlusFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhonePlusFieldFocusGained
        StatusBar.setText("Введите номер телефона отдела продаж фирмы-продавца");
    }//GEN-LAST:event_PhonePlusFieldFocusGained

    private void BankFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BankFieldFocusGained
        StatusBar.setText("Наименования банка фирмы-продавца");
    }//GEN-LAST:event_BankFieldFocusGained

    private void AccountFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccountFieldFocusGained
        StatusBar.setText("Номер счета в банке фирмы-продавца");
    }//GEN-LAST:event_AccountFieldFocusGained

    private void ClientFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ClientFieldFocusGained
        StatusBar.setText("Введите наименование фирмы-покупателя");
    }//GEN-LAST:event_ClientFieldFocusGained

    private void InnClientFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InnClientFieldFocusGained
        StatusBar.setText("Введите ИНН фирмы-покупателя");
    }//GEN-LAST:event_InnClientFieldFocusGained

    private void CountryClientFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CountryClientFieldFocusGained
        StatusBar.setText("Введите страну фирмы-покупателя");
    }//GEN-LAST:event_CountryClientFieldFocusGained

    private void DirectorFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DirectorFieldFocusGained
        StatusBar.setText("Введите ФИО директора фирмы-покупателя");
    }//GEN-LAST:event_DirectorFieldFocusGained

    private void AddressClientFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressClientFieldFocusGained
       StatusBar.setText("Введите адрес фирмы-покупателя");
    }//GEN-LAST:event_AddressClientFieldFocusGained

    private void PhoneDirFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneDirFieldFocusGained
        StatusBar.setText("Введите номер телефона фирмы-покупателя");
    }//GEN-LAST:event_PhoneDirFieldFocusGained

    private void BankClientFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BankClientFieldFocusGained
        StatusBar.setText("Введите наименования банка фирмы-покупателя");
    }//GEN-LAST:event_BankClientFieldFocusGained

    private void AccountClientFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccountClientFieldFocusGained
        StatusBar.setText("Введите номер счета в банке фирмы-покупателя");
    }//GEN-LAST:event_AccountClientFieldFocusGained

    private void NameCategoryFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameCategoryFieldFocusGained
        StatusBar.setText("Введите наименования категории товара");
    }//GEN-LAST:event_NameCategoryFieldFocusGained

    private void CancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderActionPerformed
        Add.setEnabled(true);
        Delete.setEnabled(true);
        Update.setEnabled(true);
        Tables.setEnabled(true);
        SearchField.setEnabled(true);
        Search.setEnabled(true);
        ButtonsOrder.setVisible(false);
        this.setSize(1374,397);
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else{
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }   
        ComboGoodsID.setEnabled(true);
    }//GEN-LAST:event_CancelOrderActionPerformed

    private void DateStartFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_DateStartFieldCaretUpdate
        String str = DateStartField.getText();
        if (Check.checkDate(str)==true)
        {
            DateStartField.setBorder(new LineBorder(Color.GREEN, 2));
            DateStartFieldCheck=1;
        }
        else 
        {
            DateStartField.setBorder(new LineBorder(Color.RED, 2));
            DateStartFieldCheck=0;
        } 
    }//GEN-LAST:event_DateStartFieldCaretUpdate

    private void AddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrderActionPerformed
        if (DateStartFieldCheck!=1 || PeriodFieldCheck!=1 || GoodsIDFieldCheck!=1)
        {
            JOptionPane.showMessageDialog(AddSeller, "Не правильно заполнено поле или поля", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            String Goods=GoodsOrderField.getText();
            String DateStart = null;
            try {
                DateStart = DateFormat(DateStartField.getText());
            } 
            catch (ParseException ex) {
                Logger.getLogger(Stolica.class.getName()).log(Level.SEVERE, null, ex);
            }
            int Period=Integer.valueOf(PeriodField.getText());
            long GoodsID=Long.valueOf(GoodsIDField.getText());
            int Count=Integer.valueOf(CountOrderField.getText());
            String Category=CategoryOrderField.getText();
            String ID_Goods = (String) ComboGoodsID.getSelectedItem();
            String Status="Поступил";
            System.out.println(ID_Goods);
            if (Control==0){
                OrderObj.setOrder(ID_Goods);
                OrderObj.addOrder(Goods, DateStart, Period, GoodsID, Count, Category);
                OrderObj.updateGoods(Status);
            }
            else{
                int idRowTable = OrderTable.getSelectedRow();
                String ID_Order =(String) OrderTable.getValueAt(idRowTable, 0);
                OrderObj.setOrder(ID_Goods);
                OrderObj.updateOrder(ID_Order, Goods, DateStart, Period, GoodsID, Count, Category); 
            }   
            ResultSet rs=getResult(5);
            TableModel OrderModel=new OrderModel(rs);
            OrderTable.setModel(OrderModel);
            rs=getResult(4);
            TableModel GoodsModel=new GoodsModel(rs);
            GoodsTable.setModel(GoodsModel);
            mdbc.close(rs);
            RowSorter<TableModel> sorter =new TableRowSorter<>(OrderModel);
            OrderTable.setRowSorter(sorter);
            Add.setEnabled(true);
            Delete.setEnabled(true);
            Update.setEnabled(true);
            Tables.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
            ButtonsOrder.setVisible(false);
            GoodsTable.setEnabled(true);
            SellerTable.setEnabled(true);
            BuyerTable.setEnabled(true);
            BuysTable.setEnabled(true);
            CategoryTable.setEnabled(true);
            OrderTable.setEnabled(true);
            Menu.setEnabled(true);
            this.setSize(1374,397);
        }
        getRow();
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }   
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
        ComboGoodsID.setEnabled(true);
    }//GEN-LAST:event_AddOrderActionPerformed

    private void GoodsIDFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_GoodsIDFieldCaretUpdate
        String str = GoodsIDField.getText();
        if (Check.checkGoodsID(str)==true)
        {
            GoodsIDField.setBorder(new LineBorder(Color.GREEN, 2));
            GoodsIDFieldCheck=1;
        }
        else 
        {
            GoodsIDField.setBorder(new LineBorder(Color.RED, 2));
            GoodsIDFieldCheck=0;
        } 
    }//GEN-LAST:event_GoodsIDFieldCaretUpdate

    private void PeriodFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PeriodFieldCaretUpdate
        String str = PeriodField.getText();
        if (Check.checkPeriod(str)==true)
        {
            PeriodField.setBorder(new LineBorder(Color.GREEN, 2));
            PeriodFieldCheck=1;
        }
        else 
        {
            PeriodField.setBorder(new LineBorder(Color.RED, 2));
            PeriodFieldCheck=0;
        } 
    }//GEN-LAST:event_PeriodFieldCaretUpdate

    private void ComboGoodsIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboGoodsIDItemStateChanged
        String itemGoods = (String) ComboGoodsID.getSelectedItem();
        OrderObj.setOrder(itemGoods);
        String Goods = OrderObj.Goods();
        int Count = OrderObj.Count();
        String CategoryOrder=OrderObj.CategoryOrder(); 
        if (ComboGoodsID.getSelectedIndex()>-1)
        {
            GoodsOrderField.setText(Goods);
            CountOrderField.setText(Integer.toString(Count));
            CategoryOrderField.setText(CategoryOrder);
        }        
    }//GEN-LAST:event_ComboGoodsIDItemStateChanged

    private void CostPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CostPanelComponentShown
        DateOtchetStart.setBorder(new LineBorder(Color.GREEN, 0));
        DateOtchetEnd.setBorder(new LineBorder(Color.GREEN, 0));
        Add.setEnabled(false);
        Delete.setEnabled(false);
        Update.setEnabled(false);
        SearchField.setEnabled(false);
        Search.setEnabled(false);
        MenuAdd.setEnabled(false);
        MenuEdit.setEnabled(false);
        MenuDelete.setEnabled(false);
    }//GEN-LAST:event_CostPanelComponentShown

    private void CostPanelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CostPanelComponentHidden

        if (GoodsTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        if (SellerTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        if (BuyerTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        if (CategoryTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        if (BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        if (OrderTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        Add.setEnabled(true);
        MenuAdd.setEnabled(true);
    }//GEN-LAST:event_CostPanelComponentHidden

    private void DateOtchetStartCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_DateOtchetStartCaretUpdate
        String str = DateOtchetStart.getText();
        if (Check.checkDate(str)==true)
        {
            DateOtchetStart.setBorder(new LineBorder(Color.GREEN, 2));
            DateOtchetStartCheck=1;
        }
        else 
        {
            DateOtchetStart.setBorder(new LineBorder(Color.RED, 2));
            DateOtchetStartCheck=0;
        } 
    }//GEN-LAST:event_DateOtchetStartCaretUpdate

    private void DateOtchetEndCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_DateOtchetEndCaretUpdate
        String str = DateOtchetEnd.getText();
        if (Check.checkDate(str)==true)
        {
            DateOtchetEnd.setBorder(new LineBorder(Color.GREEN, 2));
            DateOtchetEndCheck=1;
        }
        else 
        {
            DateOtchetEnd.setBorder(new LineBorder(Color.RED, 2));
            DateOtchetEndCheck=0;
        } 
    }//GEN-LAST:event_DateOtchetEndCaretUpdate

    private void FormOtchetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormOtchetActionPerformed
        if (DateOtchetStartCheck!=1 && DateOtchetEndCheck!=1)
        {    
            JOptionPane.showMessageDialog(AddSeller, "Не выбран период", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            try {
                DateStart=DateFormatOtchet(DateOtchetStart.getText());
            } 
            catch (ParseException ex) {
                Logger.getLogger(Stolica.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                DateEnd=DateFormatOtchet(DateOtchetEnd.getText());
            } 
            catch (ParseException ex) {
                Logger.getLogger(Stolica.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(DateStart);
            System.out.println(DateEnd);
            ResultSet rs=getResult(7);
            TableModel GoodsModel=new GoodsModel(rs);
            GoodsTable.setModel(GoodsModel);
            rs=getResult(8);
            TableModel BuyGoodsModel=new BuyGoodsModel(rs);
            BuysTable.setModel(BuyGoodsModel);
            mdbc.close(rs);
            RowSorter<TableModel> sorter =new TableRowSorter<>(GoodsModel);
            GoodsTable.setRowSorter(sorter);
            sorter =new TableRowSorter<>(BuyGoodsModel);
            BuysTable.setRowSorter(sorter);
        }
        double SumEnd;
        SumEnd=SumBuys()-(SumGoods());
        OutlayResultLabel.setText(Double.toString(SumGoods())+" руб.");
        SubResulLabel.setText(Double.toString(SumBuys())+" руб.");
        ProfitResultLabel.setText(Double.toString(round(SumEnd,2))+" руб.");
        FormOtchet.setBorder(new LineBorder(Color.GREEN, 2));
        SellerTable.setVisible(false);
        BuyerTable.setVisible(false);
        CategoryTable.setVisible(false);
        OrderTable.setVisible(false);
        this.setSize(1374,364); 
    }//GEN-LAST:event_FormOtchetActionPerformed

    private void CancelOtchetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOtchetActionPerformed
        ResultSet rs=getResult(4);
        TableModel GoodsModel=new GoodsModel(rs);
        GoodsTable.setModel(GoodsModel);
        rs=getResult(6);
        TableModel BuyGoodsModel=new BuyGoodsModel(rs);
        BuysTable.setModel(BuyGoodsModel);
        mdbc.close(rs);
        RowSorter<TableModel> sorter =new TableRowSorter<>(GoodsModel);
        GoodsTable.setRowSorter(sorter);
        sorter =new TableRowSorter<>(BuyGoodsModel);
        BuysTable.setRowSorter(sorter);
        FormOtchet.setBorder(new LineBorder(Color.GREEN, 0));
        OutlayResultLabel.setText("");
        SubResulLabel.setText("");
        ProfitResultLabel.setText("");
        SellerTable.setVisible(true);
        BuyerTable.setVisible(true);
        CategoryTable.setVisible(true);
        OrderTable.setVisible(true);
        this.setSize(1374,397);
        DateOtchetStart.setBorder(new LineBorder(Color.GREEN, 0));
        DateOtchetEnd.setBorder(new LineBorder(Color.GREEN, 0));
    }//GEN-LAST:event_CancelOtchetActionPerformed

    private void ComboBuyerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboBuyerFocusGained
        StatusBar.setText("Выберите фирму-покупателя товара");
    }//GEN-LAST:event_ComboBuyerFocusGained

    private void ComboGoodsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboGoodsItemStateChanged
        String itemGoods = (String) ComboGoods.getSelectedItem();
        String itemBuyer = (String) ComboBuyer.getSelectedItem();
        String itemOrder = (String) ComboGoods.getSelectedItem();
        BuyGoodsObj.setBuyGoods(itemGoods, itemOrder, itemBuyer);
        double CostUnit=BuyGoodsObj.CostUnit();
        double Recommm =  CostUnit*1.3;
        if (ComboGoods.getSelectedIndex()>-1){
            CostGoods.setText(Integer.toString(BuyGoodsObj.Count())+" штук товаров на складе по цене " + Double.toString(BuyGoodsObj.CostUnit()) +" за штуку. Рекомендуемая цена "+ Recommm+ " руб.");
        }
    }//GEN-LAST:event_ComboGoodsItemStateChanged

    private void CancelBuysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBuysActionPerformed
        Add.setEnabled(true);
        Delete.setEnabled(true);
        Update.setEnabled(true);
        Tables.setEnabled(true);
        SearchField.setEnabled(true);
        Search.setEnabled(true);
        ButtonsBuys.setVisible(false);
        this.setSize(1374,397);
        GoodsTable.setEnabled(true);
        SellerTable.setEnabled(true);
        BuyerTable.setEnabled(true);
        BuysTable.setEnabled(true);
        CategoryTable.setEnabled(true);
        OrderTable.setEnabled(true);
        Menu.setEnabled(true);
        getRow();
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else{
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        CostGoods.setText("");
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
    }//GEN-LAST:event_CancelBuysActionPerformed

    private void CancelBuysMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBuysMouseExited
        StatusBar.setText("");
    }//GEN-LAST:event_CancelBuysMouseExited

    private void CancelBuysMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBuysMouseMoved
        StatusBar.setText("Отменить действие с продажей");
    }//GEN-LAST:event_CancelBuysMouseMoved

    private void AddBuysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBuysActionPerformed
        if (VolumeFieldCheck!=1 || CostUnitVolFieldCheck!=1)
        {
            JOptionPane.showMessageDialog(AddBuys, "Не правильно заполнено поле или поля", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            int Volume=Integer.valueOf(VolumeField.getText());
            double CostUnitVol=Double.valueOf(CostUnitVolField.getText());
            String DateVolume = null;
            try {
                DateVolume = DateFormat(DateToday());
            } 
            catch (ParseException ex) {
                Logger.getLogger(Stolica.class.getName()).log(Level.SEVERE, null, ex);
            }
            String itemGoods = (String) ComboGoods.getSelectedItem();
            String itemOrder = (String) ComboGoods.getSelectedItem();
            String itemBuyer = (String) ComboBuyer.getSelectedItem();
            double AllCostBuy= CostUnitVol*Volume;
            BuyGoodsObj.setBuyGoods(itemGoods,itemOrder, itemBuyer);
            int Count=BuyGoodsObj.Count();
            double CostUnit=BuyGoodsObj.CostUnit();
            if (CostUnit<CostUnitVol)
            {
                if (Count>Volume)
                {
                    if (Control == 0)
                    {
                        BuyGoodsObj.addBuyGoods(Volume, CostUnitVol, AllCostBuy, DateVolume);
                    }
                    else
                    {
                        int idRowTable = BuysTable.getSelectedRow();
                        String ID_Sell =(String) BuysTable.getValueAt(idRowTable, 0);
                        BuyGoodsObj.updateBuyGoods(ID_Sell, Volume, CostUnitVol, AllCostBuy, DateVolume);
                    }
                    ResultSet rs=getResult(6);
                    TableModel BuyGoodsModel=new BuyGoodsModel(rs);
                    BuysTable.setModel(BuyGoodsModel);
                    mdbc.close(rs);
                    RowSorter<TableModel> sorter =new TableRowSorter<>(BuyGoodsModel);
                    BuysTable.setRowSorter(sorter);
                    rs=getResult(5);
                    TableModel OrderModel=new OrderModel(rs);
                    OrderTable.setModel(OrderModel);
                    mdbc.close(rs);
                    sorter =new TableRowSorter<>(OrderModel);
                    GoodsTable.setRowSorter(sorter);
                    Add.setEnabled(true);
                    Delete.setEnabled(true);
                    Update.setEnabled(true);
                    Tables.setEnabled(true);
                    SearchField.setEnabled(true);
                    Search.setEnabled(true);
                    ButtonsBuys.setVisible(false);
                    this.setSize(1280,390);
                    GoodsTable.setEnabled(true);
                    SellerTable.setEnabled(true);
                    BuyerTable.setEnabled(true);
                    BuysTable.setEnabled(true);
                    CategoryTable.setEnabled(true);
                    OrderTable.setEnabled(true);
                    Menu.setEnabled(true);
                    getRow();
                }
                else
                JOptionPane.showMessageDialog(null, "На складе нет столько выбранного товара", "Ошибка", ERROR_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(null, "Нельзя продать товар дешевле, чем он куплен", "Ошибка", ERROR_MESSAGE);
        }
        if ((Tables.getSelectedComponent()==GoodsPanel) && GoodsTable.getRowCount()==0 || (Tables.getSelectedComponent()==SellerPanel) && SellerTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuyerPanel) && BuyerTable.getRowCount()==0 || (Tables.getSelectedComponent()==CategoryPanel) && CategoryTable.getRowCount()==0 || (Tables.getSelectedComponent()==BuysPanel) && BuysTable.getRowCount()==0)
        {
            Update.setEnabled(false);
            Delete.setEnabled(false);
            MenuEdit.setEnabled(false);
            MenuDelete.setEnabled(false);
            SearchField.setEnabled(false);
            Search.setEnabled(false);
        }
        else
        {
            Update.setEnabled(true);
            Delete.setEnabled(true);
            MenuEdit.setEnabled(true);
            MenuDelete.setEnabled(true);
            SearchField.setEnabled(true);
            Search.setEnabled(true);
        }
        CostGoods.setText("");
        Add.setBorder(new LineBorder(Color.white, 0, true));
        Update.setBorder(new LineBorder(Color.white, 0, true));
    }//GEN-LAST:event_AddBuysActionPerformed

    private void AddBuysMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBuysMouseExited
        StatusBar.setText("");        
    }//GEN-LAST:event_AddBuysMouseExited

    private void AddBuysMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBuysMouseMoved
        StatusBar.setText("Сохранить продажу в таблице");
    }//GEN-LAST:event_AddBuysMouseMoved

    private void CostUnitVolFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CostUnitVolFieldFocusGained
        StatusBar.setText("Цена за единицу товара");
    }//GEN-LAST:event_CostUnitVolFieldFocusGained

    private void CostUnitVolFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CostUnitVolFieldCaretUpdate
        String str = CostUnitVolField.getText();
        if (Check.checkCost(str)==true)
        {
            CostUnitVolField.setBorder(new LineBorder(Color.GREEN, 2));
            CostUnitVolFieldCheck=1;
        }
        else
        {
            CostUnitVolField.setBorder(new LineBorder(Color.RED, 2));
            CostUnitVolFieldCheck=0;
        }
    }//GEN-LAST:event_CostUnitVolFieldCaretUpdate

    private void VolumeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VolumeFieldFocusGained
        StatusBar.setText("Кoличество товара на продажу");
    }//GEN-LAST:event_VolumeFieldFocusGained

    private void VolumeFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_VolumeFieldCaretUpdate
        String str = VolumeField.getText();
        if (Check.checkPeriod(str)==true)
        {
            VolumeField.setBorder(new LineBorder(Color.GREEN, 2));
            VolumeFieldCheck=1;
        }
        else
        {
            VolumeField.setBorder(new LineBorder(Color.RED, 2));
            VolumeFieldCheck=0;
        }
    }//GEN-LAST:event_VolumeFieldCaretUpdate

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try{
                new Stolica().setVisible(true);
            }
            catch(Exception e){
            }
        }
        );
    }
    
   public ResultSet getResult(int i) {
        ResultSet rs=null;
        try{
            switch (i) {
                case 1:
                    rs=stmt.executeQuery("Select * from seller_firm");
                    break;
                case 2:
                    rs=stmt.executeQuery("Select * from buyer_firm");
                    break;
                case 3:
                    rs=stmt.executeQuery("Select * from category");
                    break;
                case 4:
                    rs=stmt.executeQuery("SELECT kind_goods.ID_Goods, kind_goods.Goods, kind_goods.Manufacturer, kind_goods.Unit, kind_goods.CostUnit, kind_goods.Count, kind_goods.AllCost, DATE_FORMAT(DateKind, '%e.%m.%Y'), kind_goods.Status, seller_firm.Seller, category.NameCategory\n" +
                            "FROM category INNER JOIN (seller_firm INNER JOIN kind_goods ON seller_firm.ID_Seller = kind_goods.ID_Seller) ON category.ID_Category = kind_goods.ID_Category;");
                    break;
                case 5:
                    rs=stmt.executeQuery("Select id_order, goods, DATE_FORMAT(DateStart, '%e.%m.%Y'), Period, GoodsID,Count, Category, ID_Goods from order_goods;");
           
                    break;
                case 6:
                    rs=stmt.executeQuery("SELECT buy_goods.ID_Sell, buy_goods.Volume, buy_goods.CostUnitVol, buy_goods.AllCostBuy, DATE_FORMAT(DateVolume, '%e.%m.%Y'), order_goods.Goods, buyer_firm.Client\n" +
                            "FROM order_goods INNER JOIN (buyer_firm INNER JOIN buy_goods ON buyer_firm.ID_Client = buy_goods.ID_Client) ON order_goods.ID_Order = buy_goods.ID_Order;");
                    break;
                case 7:
                   rs=stmt.executeQuery("SELECT kind_goods.ID_Goods, kind_goods.Goods, kind_goods.Manufacturer, kind_goods.Unit, kind_goods.CostUnit, kind_goods.Count, kind_goods.AllCost, DATE_FORMAT(DateKind, '%e.%m.%Y'), kind_goods.Status, seller_firm.Seller, category.NameCategory\n" +
                            "FROM category INNER JOIN (seller_firm INNER JOIN kind_goods ON seller_firm.ID_Seller = kind_goods.ID_Seller) ON category.ID_Category = kind_goods.ID_Category where DateKind >'"+DateStart+"' and DateKind<'"+DateEnd+"';");
                   break;
                case 8:
                    rs=stmt.executeQuery("SELECT buy_goods.ID_Sell, buy_goods.Volume, buy_goods.CostUnitVol, buy_goods.AllCostBuy, DATE_FORMAT(DateVolume, '%e.%m.%Y'), order_goods.Goods, buyer_firm.Client\n" +
                            "FROM order_goods INNER JOIN (buyer_firm INNER JOIN buy_goods ON buyer_firm.ID_Client = buy_goods.ID_Client) ON order_goods.ID_Order = buy_goods.ID_Order where DateVolume >'"+DateStart+"' and DateVolume<'"+DateEnd+"';");
                   break;
            }
        }
        catch(SQLException e){}
        return rs; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountClientField;
    private javax.swing.JLabel AccountClientLabel;
    private javax.swing.JTextField AccountField;
    private javax.swing.JLabel AccountLabel;
    private javax.swing.JButton Add;
    private javax.swing.JButton AddBuys;
    private javax.swing.JButton AddCategory;
    private javax.swing.JButton AddClient;
    private javax.swing.JButton AddGoods;
    private javax.swing.JButton AddOrder;
    private javax.swing.JButton AddSeller;
    private javax.swing.JTextField AddressClientField;
    private javax.swing.JLabel AddressClientLabel;
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField BankClientField;
    private javax.swing.JLabel BankClientLabel;
    private javax.swing.JTextField BankField;
    private javax.swing.JLabel BankLabel;
    private javax.swing.JPanel Buttons;
    private javax.swing.JPanel ButtonsBuyer;
    private javax.swing.JPanel ButtonsBuys;
    private javax.swing.JPanel ButtonsCategory;
    private javax.swing.JPanel ButtonsGoods;
    private javax.swing.JPanel ButtonsOrder;
    private javax.swing.JPanel ButtonsSeller;
    private javax.swing.JPanel BuyerPanel;
    private javax.swing.JScrollPane BuyerScroll;
    private javax.swing.JTable BuyerTable;
    private javax.swing.JPanel BuysPanel;
    private javax.swing.JScrollPane BuysScroll;
    private javax.swing.JTable BuysTable;
    private javax.swing.JButton CancelBuys;
    private javax.swing.JButton CancelCategory;
    private javax.swing.JButton CancelClient;
    private javax.swing.JButton CancelField;
    private javax.swing.JButton CancelGoods;
    private javax.swing.JButton CancelOrder;
    private javax.swing.JButton CancelOtchet;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JTextField CategoryOrderField;
    private javax.swing.JPanel CategoryPanel;
    private javax.swing.JScrollPane CategoryScroll;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JTextField ChiefField;
    private javax.swing.JLabel ChiefLabel;
    private javax.swing.JTextField ClientField;
    private javax.swing.JLabel ClientLabel;
    private javax.swing.JComboBox ComboBuyer;
    private javax.swing.JLabel ComboBuyerLabel;
    private javax.swing.JComboBox ComboCategory;
    private javax.swing.JLabel ComboCategoryLabel;
    private javax.swing.JComboBox ComboGoods;
    private javax.swing.JComboBox<String> ComboGoodsID;
    private javax.swing.JLabel ComboGoodsIdLabel;
    private javax.swing.JLabel ComboGoodsLabel;
    private javax.swing.JComboBox ComboSeller;
    private javax.swing.JLabel ComboSellerLabel;
    private javax.swing.JLabel CostGoods;
    private javax.swing.JPanel CostPanel;
    private javax.swing.JTextField CostUnitField;
    private javax.swing.JLabel CostUnitLabel;
    private javax.swing.JTextField CostUnitVolField;
    private javax.swing.JLabel CostUnitVolLabel;
    private javax.swing.JTextField CountField;
    private javax.swing.JLabel CountLabel;
    private javax.swing.JTextField CountOrderField;
    private javax.swing.JLabel CountOrderLabel;
    private javax.swing.JTextField CountryClientField;
    private javax.swing.JLabel CountryClientLabel;
    private javax.swing.JTextField CountryField;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JFormattedTextField DateOtchetEnd;
    private javax.swing.JFormattedTextField DateOtchetStart;
    private javax.swing.JFormattedTextField DateStartField;
    private javax.swing.JLabel DateStartLabel;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField DirectorField;
    private javax.swing.JLabel DirectorLabel;
    private javax.swing.JButton FormOtchet;
    private javax.swing.JTextField GoodsField;
    private javax.swing.JTextField GoodsIDField;
    private javax.swing.JLabel GoodsIDLabel;
    private javax.swing.JLabel GoodsLabel;
    private javax.swing.JTextField GoodsOrderField;
    private javax.swing.JLabel GoodsOrderLabel;
    private javax.swing.JPanel GoodsPanel;
    private javax.swing.JScrollPane GoodsScroll;
    private javax.swing.JTable GoodsTable;
    private javax.swing.JTextField InnClientField;
    private javax.swing.JLabel InnClientLabel;
    private javax.swing.JTextField InnSellerField;
    private javax.swing.JLabel InnSellerLabel;
    private javax.swing.JTextField ManagerField;
    private javax.swing.JLabel ManagerLabel;
    private javax.swing.JTextField ManufacturerField;
    private javax.swing.JLabel ManufacturerLabel;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar MenuAED;
    private javax.swing.JMenuItem MenuAdd;
    private javax.swing.JMenuItem MenuDelete;
    private javax.swing.JMenuItem MenuEdit;
    private javax.swing.JMenu MenuExit;
    private javax.swing.JTextField NameCategoryField;
    private javax.swing.JLabel NameCategoryLabel;
    private javax.swing.JPanel OrderPanel;
    private javax.swing.JScrollPane OrderScroll;
    private javax.swing.JTable OrderTable;
    private javax.swing.JLabel OtchetLabel;
    private javax.swing.JLabel OutlayLabel;
    private javax.swing.JLabel OutlayResultLabel;
    private javax.swing.JTextField PeriodField;
    private javax.swing.JLabel PeriodLabel;
    private javax.swing.JTextField PhoneDirField;
    private javax.swing.JLabel PhoneDirLabel;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhonePlusField;
    private javax.swing.JLabel PhonePlusLabel;
    private javax.swing.JLabel ProfitLabel;
    private javax.swing.JLabel ProfitResultLabel;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTextField SellerField;
    private javax.swing.JLabel SellerLabel;
    private javax.swing.JPanel SellerPanel;
    private javax.swing.JScrollPane SellerScroll;
    private javax.swing.JTable SellerTable;
    private javax.swing.JLabel StatusBar;
    private javax.swing.JLabel SubResulLabel;
    private javax.swing.JLabel SumLabel;
    private javax.swing.JTabbedPane Tables;
    private javax.swing.JComboBox<String> UnitField;
    private javax.swing.JLabel UnitLabel;
    private javax.swing.JButton Update;
    private javax.swing.JTextField VolumeField;
    private javax.swing.JLabel VolumeLabel;
    // End of variables declaration//GEN-END:variables
}