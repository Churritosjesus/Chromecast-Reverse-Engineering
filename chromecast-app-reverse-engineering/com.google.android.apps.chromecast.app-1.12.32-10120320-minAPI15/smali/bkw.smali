.class final Lbkw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lblc;


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 511
    iput-object p1, p0, Lbkw;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbkv;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 511
    .line 1514
    new-instance v0, Lbkx;

    invoke-direct {v0, p0, p1, p2}, Lbkx;-><init>(Lbkw;Lbkv;Ljava/lang/CharSequence;)V

    .line 511
    return-object v0
.end method
