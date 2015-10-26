.class final Lbbb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbaz;


# direct methods
.method constructor <init>(Lbaz;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lbbb;->a:Lbaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lbbb;->a:Lbaz;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbaz;->a(Lbaz;Z)Z

    .line 80
    iget-object v0, p0, Lbbb;->a:Lbaz;

    invoke-static {v0}, Lbaz;->a(Lbaz;)Laxd;

    move-result-object v0

    invoke-virtual {v0}, Laxd;->a()V

    .line 81
    iget-object v0, p0, Lbbb;->a:Lbaz;

    invoke-static {v0}, Lbaz;->a(Lbaz;)Laxd;

    move-result-object v0

    invoke-virtual {v0}, Laxd;->b()V

    .line 82
    iget-object v0, p0, Lbbb;->a:Lbaz;

    invoke-static {v0}, Lbaz;->b(Lbaz;)V

    .line 83
    return-void
.end method
