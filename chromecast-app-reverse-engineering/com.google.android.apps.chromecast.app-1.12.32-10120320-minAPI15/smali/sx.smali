.class final Lsx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private synthetic a:Lsw;


# direct methods
.method constructor <init>(Lsw;Lsr;)V
    .locals 0

    .prologue
    .line 990
    iput-object p1, p0, Lsx;->a:Lsw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .prologue
    .line 993
    iget-object v0, p0, Lsx;->a:Lsw;

    iget-object v0, v0, Lsw;->a:Lsr;

    invoke-virtual {v0, p3}, Lsr;->a(I)V

    .line 994
    iget-object v0, p0, Lsx;->a:Lsw;

    iget-object v0, v0, Lsw;->a:Lsr;

    iget-object v0, v0, Lsr;->l:Lrz;

    if-eqz v0, :cond_0

    .line 995
    iget-object v0, p0, Lsx;->a:Lsw;

    iget-object v0, v0, Lsw;->a:Lsr;

    iget-object v1, p0, Lsx;->a:Lsw;

    invoke-static {v1}, Lsw;->a(Lsw;)Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1, p3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v0, p2, p3, v2, v3}, Lsr;->a(Landroid/view/View;IJ)Z

    .line 998
    :cond_0
    iget-object v0, p0, Lsx;->a:Lsw;

    invoke-virtual {v0}, Lsw;->a()V

    .line 999
    return-void
.end method
