.class final Lao;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private synthetic a:Lam;


# direct methods
.method constructor <init>(Lam;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lao;->a:Lam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lao;->a:Lam;

    invoke-virtual {v0, p2, p3}, Lam;->a(Landroid/view/View;I)V

    .line 59
    return-void
.end method
