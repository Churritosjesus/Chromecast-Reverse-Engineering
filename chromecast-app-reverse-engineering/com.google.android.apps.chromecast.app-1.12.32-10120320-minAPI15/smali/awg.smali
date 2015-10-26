.class public final Lawg;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/os/Handler;

.field final b:Lbfs;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lbfs;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p2, p0, Lawg;->b:Lbfs;

    .line 21
    iput-object p1, p0, Lawg;->a:Landroid/os/Handler;

    .line 22
    return-void
.end method
