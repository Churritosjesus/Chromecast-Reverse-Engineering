.class public final Lbde;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbde;->a:Z

    .line 37
    iput-object v1, p0, Lbde;->b:Ljava/lang/String;

    .line 44
    iput-object v1, p0, Lbde;->c:Ljava/lang/String;

    return-void
.end method
