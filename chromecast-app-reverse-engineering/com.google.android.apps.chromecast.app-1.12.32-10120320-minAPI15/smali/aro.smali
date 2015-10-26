.class final Laro;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lark;


# direct methods
.method constructor <init>(Lark;)V
    .locals 0

    .prologue
    .line 261
    iput-object p1, p0, Laro;->a:Lark;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    .line 264
    iget-object v0, p0, Laro;->a:Lark;

    invoke-static {v0}, Lark;->b(Lark;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Laef;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 265
    return-void
.end method
