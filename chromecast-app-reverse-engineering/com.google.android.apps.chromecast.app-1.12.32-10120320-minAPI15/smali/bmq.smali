.class final Lbmq;
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
    .line 99
    iput-object p1, p0, Lbmq;->a:Lbmn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lbmq;->a:Lbmn;

    invoke-static {v0}, Lbmn;->a(Lbmn;)Laow;

    move-result-object v0

    invoke-virtual {v0}, Laow;->b()V

    .line 103
    return-void
.end method
