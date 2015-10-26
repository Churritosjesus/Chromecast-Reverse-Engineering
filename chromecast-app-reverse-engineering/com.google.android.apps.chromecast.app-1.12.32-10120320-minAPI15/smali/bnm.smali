.class final Lbnm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Lboc;

.field private synthetic c:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Laow;Lboc;)V
    .locals 0

    .prologue
    .line 708
    iput-object p1, p0, Lbnm;->c:Lbmu;

    iput-object p2, p0, Lbnm;->a:Laow;

    iput-object p3, p0, Lbnm;->b:Lboc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 711
    iget-object v0, p0, Lbnm;->c:Lbmu;

    .line 1069
    iget-object v0, v0, Lbmu;->g:Lbob;

    .line 711
    iget-object v1, p0, Lbnm;->a:Laow;

    iget-object v2, p0, Lbnm;->c:Lbmu;

    iget-object v3, p0, Lbnm;->b:Lboc;

    .line 712
    invoke-virtual {v3}, Lboc;->c()I

    move-result v3

    invoke-static {v2, v3}, Lbmu;->a(Lbmu;I)I

    move-result v2

    .line 711
    invoke-interface {v0, v1, v2}, Lbob;->a(Laow;I)V

    .line 713
    return-void
.end method
