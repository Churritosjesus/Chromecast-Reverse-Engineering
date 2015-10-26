.class final Lbhi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field private synthetic a:Ljava/util/List;

.field private synthetic b:Lbhf;


# direct methods
.method constructor <init>(Lbhf;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 658
    iput-object p1, p0, Lbhi;->b:Lbhf;

    iput-object p2, p0, Lbhi;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 661
    iget-object v1, p0, Lbhi;->b:Lbhf;

    iget-object v0, p0, Lbhi;->a:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbcz;

    invoke-static {v1, v0}, Lbhf;->a(Lbhf;Lbcz;)V

    .line 662
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    .prologue
    .line 665
    return-void
.end method
