.class final Laxv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laxq;


# direct methods
.method constructor <init>(Laxq;)V
    .locals 0

    .prologue
    .line 365
    iput-object p1, p0, Laxv;->a:Laxq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Laxv;->a:Laxq;

    .line 1039
    iget-object v0, v0, Laxq;->b:Landroid/content/Context;

    .line 368
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lblx;->f(Landroid/app/Activity;)V

    .line 369
    const/16 v0, 0x80

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    invoke-virtual {v0}, Lapg;->b()V

    .line 370
    return-void
.end method
