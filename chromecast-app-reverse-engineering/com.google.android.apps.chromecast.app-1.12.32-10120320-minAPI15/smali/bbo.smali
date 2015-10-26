.class final Lbbo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbve;


# instance fields
.field private synthetic a:Lbbn;


# direct methods
.method constructor <init>(Lbbn;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lbbo;->a:Lbbn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 76
    new-array v0, v3, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 77
    iget-object v0, p0, Lbbo;->a:Lbbn;

    invoke-static {v0, v3}, Lbbn;->a(Lbbn;Z)V

    .line 78
    return-void
.end method
