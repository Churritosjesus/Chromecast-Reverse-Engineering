.class final Layn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 257
    .line 2260
    new-instance v0, Laym;

    invoke-direct {v0, p1}, Laym;-><init>(Landroid/os/Parcel;)V

    .line 257
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 257
    .line 1265
    new-array v0, p1, [Laym;

    .line 257
    return-object v0
.end method
