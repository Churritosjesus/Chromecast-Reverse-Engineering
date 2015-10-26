.class final Lbmo;
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
    .line 83
    iput-object p1, p0, Lbmo;->a:Lbmn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lbmo;->a:Lbmn;

    .line 1167
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li;->a(Z)V

    .line 88
    return-void
.end method
