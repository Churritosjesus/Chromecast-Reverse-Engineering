.class final Luu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lut;


# direct methods
.method constructor <init>(Lut;)V
    .locals 0

    .prologue
    .line 427
    iput-object p1, p0, Luu;->a:Lut;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Luu;->a:Lut;

    invoke-static {v0}, Lut;->a(Lut;)V

    .line 431
    return-void
.end method
