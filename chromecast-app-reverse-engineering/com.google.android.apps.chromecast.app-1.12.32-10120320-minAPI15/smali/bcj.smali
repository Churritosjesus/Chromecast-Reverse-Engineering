.class public final Lbcj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbcd;

.field private synthetic b:Lbcm;


# direct methods
.method public constructor <init>(Lbch;Lbcd;Lbcm;)V
    .locals 0

    .prologue
    .line 82
    iput-object p2, p0, Lbcj;->a:Lbcd;

    iput-object p3, p0, Lbcj;->b:Lbcm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 85
    const/16 v0, 0x8e

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Lbcj;->a:Lbcd;

    .line 1108
    iget-object v1, v1, Lbcd;->a:Ldbk;

    .line 86
    iget-object v1, v1, Ldbk;->a:Ljava/lang/String;

    .line 2084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 87
    invoke-virtual {v0}, Lapg;->b()V

    .line 88
    iget-object v0, p0, Lbcj;->b:Lbcm;

    iget-object v1, p0, Lbcj;->a:Lbcd;

    invoke-interface {v0, v1}, Lbcm;->a(Lbcd;)V

    .line 89
    return-void
.end method
