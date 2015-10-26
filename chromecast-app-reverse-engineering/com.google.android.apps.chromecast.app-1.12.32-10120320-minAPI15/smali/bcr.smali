.class final Lbcr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lbcn;


# direct methods
.method constructor <init>(Lbcn;)V
    .locals 0

    .prologue
    .line 259
    iput-object p1, p0, Lbcr;->a:Lbcn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 262
    iget-object v0, p0, Lbcr;->a:Lbcn;

    invoke-static {v0}, Lbcn;->a(Lbcn;)Lblp;

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    if-eqz p1, :cond_0

    iget-object v0, p1, Laef;->a:Ladp;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p1, Laef;->a:Ladp;

    iget v0, v0, Ladp;->a:I

    .line 263
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v1

    .line 265
    return-void

    :cond_0
    move v0, v1

    .line 264
    goto :goto_0
.end method
