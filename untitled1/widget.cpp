#include "widget.h"
#include "ui_widget.h"

Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);
    setWindowTitle("Calculadora");
    ui->Resultado->setText("0.0");
}

Widget::~Widget()
{
    delete ui;
}


void Widget::on_Suma_clicked()
{
    ui->Resultado->setText(QString::number(ui->n1->value() + ui->n2->value()));
}


void Widget::on_Resta_clicked()
{
    ui->Resultado->setText(QString::number(ui->n1->value() - ui->n2->value()));
}


void Widget::on_Multiplica_clicked()
{
    ui->Resultado->setText(QString::number(ui->n1->value() * ui->n2->value()));
}


void Widget::on_Divide_clicked()
{
    ui->Resultado->setText(QString::number(ui->n1->value() / ui->n2->value()));
}

