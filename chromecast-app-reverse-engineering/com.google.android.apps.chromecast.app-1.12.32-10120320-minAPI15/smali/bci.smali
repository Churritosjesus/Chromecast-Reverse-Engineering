.class public final Lbci;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbcd;

.field private synthetic b:Lbcm;

.field private synthetic c:Lbch;


# direct methods
.method public constructor <init>(Lbch;Lbcd;Lbcm;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lbci;->c:Lbch;

    iput-object p2, p0, Lbci;->a:Lbcd;

    iput-object p3, p0, Lbci;->b:Lbcm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lbci;->c:Lbch;

    .line 1028
    iget-object v0, v0, Lbch;->n:Lyt;

    .line 1193
    iget-object v0, v0, Lyt;->c:Lqn;

    invoke-virtual {v0}, Lqn;->b()V

    .line 75
    const/16 v0, 0x8f

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Lbci;->a:Lbcd;

    .line 2108
    iget-object v1, v1, Lbcd;->a:Ldbk;

    .line 76
    iget-object v1, v1, Ldbk;->a:Ljava/lang/String;

    .line 3084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 77
    invoke-virtual {v0}, Lapg;->b()V

    .line 79
    return-void
.end method
