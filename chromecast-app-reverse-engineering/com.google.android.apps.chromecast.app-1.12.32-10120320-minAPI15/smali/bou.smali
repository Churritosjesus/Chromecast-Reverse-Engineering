.class final Lbou;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field private synthetic a:Lbos;


# direct methods
.method constructor <init>(Lbos;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lbou;->a:Lbos;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lbou;->a:Lbos;

    invoke-static {v0}, Lbos;->b(Lbos;)V

    .line 119
    iget-object v0, p0, Lbou;->a:Lbos;

    invoke-static {v0}, Lbos;->a(Lbos;)V

    .line 120
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lbou;->a:Lbos;

    invoke-static {v0}, Lbos;->b(Lbos;)V

    .line 125
    iget-object v0, p0, Lbou;->a:Lbos;

    invoke-static {v0}, Lbos;->a(Lbos;)V

    .line 126
    return-void
.end method
