.class final Lbgy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field private synthetic a:Lbgv;


# direct methods
.method constructor <init>(Lbgv;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lbgy;->a:Lbgv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 105
    iget-object v1, p0, Lbgy;->a:Lbgv;

    iget-object v0, p0, Lbgy;->a:Lbgv;

    .line 106
    invoke-static {v0}, Lbgv;->c(Lbgv;)Landroid/widget/Spinner;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblm;

    .line 1265
    iget-object v0, v0, Lblm;->a:Ljava/lang/String;

    .line 105
    invoke-static {v1, v0}, Lbgv;->a(Lbgv;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 2

    .prologue
    .line 111
    iget-object v0, p0, Lbgy;->a:Lbgv;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbgv;->a(Lbgv;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    return-void
.end method
