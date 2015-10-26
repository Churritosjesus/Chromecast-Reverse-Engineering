.class public final Lna;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private synthetic a:Lmx;

.field private synthetic b:Lmz;


# direct methods
.method public constructor <init>(Lmz;Lmx;)V
    .locals 0

    .prologue
    .line 804
    iput-object p1, p0, Lna;->b:Lmz;

    iput-object p2, p0, Lna;->a:Lmx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 807
    iget-object v0, p0, Lna;->b:Lmz;

    iget-object v0, v0, Lmz;->i:Landroid/content/DialogInterface$OnClickListener;

    iget-object v1, p0, Lna;->a:Lmx;

    .line 1057
    iget-object v1, v1, Lmx;->b:Lny;

    .line 807
    invoke-interface {v0, v1, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 809
    iget-object v0, p0, Lna;->a:Lmx;

    .line 2057
    iget-object v0, v0, Lmx;->b:Lny;

    .line 809
    invoke-virtual {v0}, Lny;->dismiss()V

    .line 811
    return-void
.end method
