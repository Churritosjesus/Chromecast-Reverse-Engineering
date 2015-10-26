.class final Lbmp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbmn;


# direct methods
.method constructor <init>(Lbmn;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lbmp;->a:Lbmn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lbmp;->a:Lbmn;

    invoke-static {v0}, Lbmn;->a(Lbmn;)Laow;

    move-result-object v0

    invoke-virtual {v0}, Laow;->c()V

    .line 95
    iget-object v0, p0, Lbmp;->a:Lbmn;

    .line 1167
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li;->a(Z)V

    .line 96
    return-void
.end method
