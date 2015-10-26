.class final Lbjc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbiy;


# direct methods
.method constructor <init>(Lbiy;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lbjc;->a:Lbiy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lbjc;->a:Lbiy;

    invoke-static {v0}, Lbiy;->a(Lbiy;)Lbjd;

    move-result-object v0

    invoke-interface {v0}, Lbjd;->h()V

    .line 155
    return-void
.end method
